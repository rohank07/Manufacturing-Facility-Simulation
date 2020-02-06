package Simulation;

/**
 * The type Inspector one.
 */
public class InspectorOne {
    private Buffer b1;

    private Buffer b2;

    private Buffer b4;

    /**
     * Instantiates a new Inspector one.
     *
     * @param b1 the b 1
     * @param b2 the b 2
     * @param b4 the b 4
     */
    public InspectorOne(Buffer b1, Buffer b2, Buffer b4) {
        this.b1 = b1;
        this.b2 = b2;
        this.b4 = b4;
    }

    /**
     * Gets b 1.
     *
     * @return the b 1
     */
    public Buffer getB1() {
        return this.b1;
    }

    /**
     * Sets b 1.
     *
     * @param b1 the b 1
     */
    public void setB1(Buffer b1) {
        this.b1 = b1;
    }

    /**
     * Gets b 2.
     *
     * @return the b 2
     */
    public Buffer getB2() {
        return this.b2;
    }

    /**
     * Sets b 2.
     *
     * @param b2 the b 2
     */
    public void setB2(Buffer b2) {
        this.b2 = b2;
    }

    /**
     * Gets b 4.
     *
     * @return the b 4
     */
    public Buffer getB4() {
        return this.b4;
    }

    /**
     * Sets b 3.
     *
     * @param b4 the b 4
     */
    public void setB3(Buffer b4) {
        this.b4 = b4;
    }

    /**
     * Buffer 1 insert.
     */
    public void buffer1Insert() {
        this.b1.addComponent(new Component(1));
    }

    /**
     * Buffer 2 insert.
     */
    public void buffer2Insert() {
        this.b2.addComponent(new Component(2));
    }

    /**
     * Buffer 4 insert.
     */
    public void buffer4Insert() {
        this.b4.addComponent(new Component(3));
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Buffer b1 = new Buffer();
        Buffer b2 = new Buffer();
        Buffer b4 = new Buffer();
        InspectorOne inspector1 = new InspectorOne(b1, b2, b4);
    }
}
