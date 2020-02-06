package Sim;

/**
 * The type Work station two.
 */
public class WorkStationTwo {
    private Buffer bufferTwo;

    private Buffer bufferThree;

    private int productQuantity;

    /**
     * Instantiates a new Work station two.
     *
     * @param bufferTwo   the buffer two
     * @param bufferThree the buffer three
     */
    public WorkStationTwo(Buffer bufferTwo, Buffer bufferThree) {
        setBufferTwo(bufferTwo);
        setBufferThree(bufferThree);
    }

    /**
     * Gets buffer three.
     *
     * @return the buffer three
     */
    public Buffer getBufferThree() {
        return this.bufferThree;
    }

    /**
     * Sets buffer three.
     *
     * @param bufferThree the buffer three
     */
    public void setBufferThree(Buffer bufferThree) {
        this.bufferThree = bufferThree;
    }

    /**
     * Gets buffer two.
     *
     * @return the buffer two
     */
    public Buffer getBufferTwo() {
        return this.bufferTwo;
    }

    /**
     * Sets buffer two.
     *
     * @param bufferTwo the buffer two
     */
    public void setBufferTwo(Buffer bufferTwo) {
        this.bufferTwo = bufferTwo;
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
