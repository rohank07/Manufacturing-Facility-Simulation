package Sim;

public class InspectorOne {
    private Buffer b1;

    private Buffer b2;

    private Buffer b4;

    public InspectorOne(Buffer b1, Buffer b2, Buffer b4) {
        this.b1 = b1;
        this.b2 = b2;
        this.b4 = b4;
    }

    public Buffer getB1() {
        return this.b1;
    }

    public void setB1(Buffer b1) {
        this.b1 = b1;
    }

    public Buffer getB2() {
        return this.b2;
    }

    public void setB2(Buffer b2) {
        this.b2 = b2;
    }

    public Buffer getB4() {
        return this.b4;
    }

    public void setB3(Buffer b4) {
        this.b4 = b4;
    }

    public void buffer1Insert() {
        this.b1.addComponent(new Component(1));
    }

    public void buffer2Insert() {
        this.b2.addComponent(new Component(2));
    }

    public void buffer4Insert() {
        this.b4.addComponent(new Component(3));
    }

    public static void main(String[] args) {
        Buffer b1 = new Buffer();
        Buffer b2 = new Buffer();
        Buffer b4 = new Buffer();
        InspectorOne inspector1 = new InspectorOne(b1, b2, b4);
    }
}
