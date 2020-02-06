package Sim;

public class WorkStationOne {
    private Buffer bufferOne;

    private int productQuantity;

    public WorkStationOne(Buffer bufferOne) {
        setBufferOne(bufferOne);
    }

    public Buffer getBufferOne() {
        return this.bufferOne;
    }

    public void setBufferOne(Buffer bufferOne) {
        this.bufferOne = bufferOne;
    }

    public int getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
