package Simulation;

/**
 * The type Inspector two.
 */
public class InspectorTwo {
    private Buffer b3;

    private Buffer b5;

    /**
     * Instantiates a new Inspector two.
     *
     * @param b3 the b 3
     * @param b5 the b 5
     */
    public InspectorTwo(Buffer b3, Buffer b5) {
        this.b3 = b3;
        this.b5 = b5;
    }

    /**
     * Buffer insert.
     */
    public void bufferInsert() {
        this.b3.addComponent(new Component(1));
    }

    /**
     * Buffer 2 insert.
     */
    public void buffer2Insert() {
        this.b5.addComponent(new Component(2));
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Buffer b3 = new Buffer();
        Buffer b5 = new Buffer();
        InspectorTwo inspector2 = new InspectorTwo(b3, b5);
    }
}
