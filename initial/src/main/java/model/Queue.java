package model;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Queue {
    private final Set<QueueItem> queueItems;

    public Queue(final Set<QueueItem> queueItems) {
        this.queueItems = queueItems;
    }

    public Set<QueueItem> getQueueItems() {
        return ImmutableSet.copyOf(queueItems);
    }
}
