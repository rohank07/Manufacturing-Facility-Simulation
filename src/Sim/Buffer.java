package Sim;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Buffer.
 */
public class Buffer {
    private final int BUFFER_SIZE = 2;

    private List<Component> queue;

    /**
     * Instantiates a new Buffer.
     */
    public Buffer() {
        setQueue(new ArrayList<>());
    }

    /**
     * Gets queue.
     *
     * @return the queue
     */
    public List<Component> getQueue() {
        return this.queue;
    }

    /**
     * Sets queue.
     *
     * @param queue the queue
     */
    public void setQueue(List<Component> queue) {
        this.queue = queue;
    }

    /**
     * Gets buffer size.
     *
     * @return the buffer size
     */
    public int getBUFFER_SIZE() {
        return this.queue.size();
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        if (this.queue.size() == 2)
            return true;
        return false;
    }

    /**
     * Add component.
     *
     * @param component the component
     */
    public void addComponent(Component component) {
        if (!isFull())
            this.queue.add(component);
    }

    /**
     * Remove component.
     *
     * @param index the index
     */
    public void removeComponent(int index) {
        if (this.queue.size() > 0) {
            this.queue.remove(index);
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
