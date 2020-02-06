package Sim;

public class WorkStationThree {
    private Buffer bufferFour;

    private Buffer bufferFive;

    private int productQuantity;

    public WorkStationThree(Buffer bufferFour, Buffer bufferFive) {
        setBufferFour(bufferFour);
        setBufferFive(bufferFive);
    }

    public int getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Buffer getBufferFour() {
        return this.bufferFour;
    }

    public void setBufferFour(Buffer bufferFour) {
        this.bufferFour = bufferFour;
    }

    public Buffer getBufferFive() {
        return this.bufferFive;
    }

    public void setBufferFive(Buffer bufferFive) {
        this.bufferFive = bufferFive;
    }
}
