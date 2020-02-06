package Simulation;

/**
 * The type Work station three.
 */
public class WorkStationThree {
    private Buffer bufferFour;

    private Buffer bufferFive;

    private int productQuantity;

    /**
     * Instantiates a new Work station three.
     *
     * @param bufferFour the buffer four
     * @param bufferFive the buffer five
     */
    public WorkStationThree(Buffer bufferFour, Buffer bufferFive) {
        setBufferFour(bufferFour);
        setBufferFive(bufferFive);
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

    /**
     * Gets buffer four.
     *
     * @return the buffer four
     */
    public Buffer getBufferFour() {
        return this.bufferFour;
    }

    /**
     * Sets buffer four.
     *
     * @param bufferFour the buffer four
     */
    public void setBufferFour(Buffer bufferFour) {
        this.bufferFour = bufferFour;
    }

    /**
     * Gets buffer five.
     *
     * @return the buffer five
     */
    public Buffer getBufferFive() {
        return this.bufferFive;
    }

    /**
     * Sets buffer five.
     *
     * @param bufferFive the buffer five
     */
    public void setBufferFive(Buffer bufferFive) {
        this.bufferFive = bufferFive;
    }
}
