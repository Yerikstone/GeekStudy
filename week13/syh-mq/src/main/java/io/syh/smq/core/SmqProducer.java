package io.syh.smq.core;

public class SmqProducer {

    private SmqBroker broker;

    public SmqProducer(SmqBroker broker) {
        this.broker = broker;
    }

    public boolean send(String topic, SmqMessage message) {
        Smq smq = this.broker.findSmq(topic);
        if (null == smq) throw new RuntimeException("Topic[" + topic + "] doesn't exist.");
        return smq.send(message);
    }
}
