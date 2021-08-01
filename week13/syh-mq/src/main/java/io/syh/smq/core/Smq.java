package io.kimmking.kmq.core;

import lombok.SneakyThrows;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class Smq {

    public Smq(String topic, int capacity) {
        this.topic = topic;
        this.capacity = capacity;
        this.queue = new LinkedBlockingQueue(capacity);
    }

    private String topic;

    private int capacity;

    private LinkedBlockingQueue<SmqMessage> queue;

    public boolean send(SmqMessage message) {
        return queue.offer(message);
    }

    public SmqMessage poll() {
        return queue.poll();
    }

    @SneakyThrows
    public SmqMessage poll(long timeout) {
        return queue.poll(timeout, TimeUnit.MILLISECONDS);
    }

}
