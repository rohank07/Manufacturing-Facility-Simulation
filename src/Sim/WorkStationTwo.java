package Sim;

public class WorkStationTwo {
    private Buffer bufferTwo;

    private Buffer bufferThree;

    private int productQuantity;

    public WorkStationTwo(Buffer bufferTwo, Buffer bufferThree) {
        setBufferTwo(bufferTwo);
        setBufferThree(bufferThree);
    }

    public Buffer getBufferThree() {
        return this.bufferThree;
    }

    public void setBufferThree(Buffer bufferThree) {
        this.bufferThree = bufferThree;
    }

    public Buffer getBufferTwo() {
        return this.bufferTwo;
    }

    public void setBufferTwo(Buffer bufferTwo) {
        this.bufferTwo = bufferTwo;
    }

    public int getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
