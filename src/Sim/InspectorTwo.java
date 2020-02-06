package Sim;

public class InspectorTwo {
    private Buffer b3;

    private Buffer b5;

    public InspectorTwo(Buffer b3, Buffer b5) {
        this.b3 = b3;
        this.b5 = b5;
    }

    public void bufferInsert() {
        this.b3.addComponent(new Component(1));
    }

    public void buffer2Insert() {
        this.b5.addComponent(new Component(2));
    }

    public static void main(String[] args) {
        Buffer b3 = new Buffer();
        Buffer b5 = new Buffer();
        InspectorTwo inspector2 = new InspectorTwo(b3, b5);
    }
}
