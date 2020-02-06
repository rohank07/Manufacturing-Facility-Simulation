package Sim;

public class Main {
    public static void main(String[] args) {
        Buffer b1 = new Buffer();
        Buffer b2 = new Buffer();
        Buffer b3 = new Buffer();
        Buffer b4 = new Buffer();
        Buffer b5 = new Buffer();
        InspectorOne inspectorOne = new InspectorOne(b1, b2, b4);
        InspectorTwo inspectorTwo = new InspectorTwo(b3, b5);
    }
}
