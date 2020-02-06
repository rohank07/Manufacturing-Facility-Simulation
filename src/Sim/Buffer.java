package Sim;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private final int BUFFER_SIZE = 2;

    private List<Component> queue;

    public Buffer() {
        setQueue(new ArrayList<>());
    }

    public List<Component> getQueue() {
        return this.queue;
    }

    public void setQueue(List<Component> queue) {
        this.queue = queue;
    }

    public int getBUFFER_SIZE() {
        return this.queue.size();
    }

    public boolean isFull() {
        if (this.queue.size() == 2)
            return true;
        return false;
    }

    public void addComponent(Component component) {
        if (!isFull())
            this.queue.add(component);
    }

    public void removeComponent(int index) {
        if (this.queue.size() > 0) {
            this.queue.remove(index);
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
