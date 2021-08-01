package io.syh.smq.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class SmqBroker { // Broker+Connection

    public static final int CAPACITY = 10000;

    private final Map<String, Smq> smqMap = new ConcurrentHashMap<>(64);

    public void createTopic(String name){
        smqMap.putIfAbsent(name, new Smq(name,CAPACITY));
    }

    public Smq findSmq(String topic) {
        return this.smqMap.get(topic);
    }

    public SmqProducer createProducer() {
        return new SmqProducer(this);
    }

    public SmqConsumer createConsumer() {
        return new SmqConsumer(this);
    }

}
