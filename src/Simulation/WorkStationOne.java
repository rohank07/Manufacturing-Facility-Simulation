package Simulation;

/**
 * The type Work station one.
 */
public class WorkStationOne {
    private Buffer bufferOne;

    private int productQuantity;

    /**
     * Instantiates a new Work station one.
     *
     * @param bufferOne the buffer one
     */
    public WorkStationOne(Buffer bufferOne) {
        setBufferOne(bufferOne);
    }

    /**
     * Gets buffer one.
     *
     * @return the buffer one
     */
    public Buffer getBufferOne() {
        return this.bufferOne;
    }

    /**
     * Sets buffer one.
     *
     * @param bufferOne the buffer one
     */
    public void setBufferOne(Buffer bufferOne) {
        this.bufferOne = bufferOne;
    }

    /**
     * Gets product quantity.
     *
     * @return the product quantity
     */
    public int getProductQuantity() {
        return this.productQuantity;
    }

    /**
     * Sets product quantity.
     *
     * @param productQuantity the product quantity
     */
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
