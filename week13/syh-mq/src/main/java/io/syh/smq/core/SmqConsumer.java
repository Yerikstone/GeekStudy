package io.syh.smq.core;

public class SmqConsumer<T> {

    private final SmqBroker broker;

    private Smq smq;

    public SmqConsumer(SmqBroker broker) {
        this.broker = broker;
    }

    public void subscribe(String topic) {
        this.smq = this.broker.findSmq(topic);
        if (null == smq) throw new RuntimeException("Topic[" + topic + "] doesn't exist.");
    }

    public SmqMessage<T> poll(long timeout) {
        return smq.poll(timeout);
    }

}
