package Sim;

public class Component {
    private int componentType;

    public Component(int componentType) {
        setComponentType(componentType);
    }

    public void setComponentType(int componentType) {
        if (componentType == 1 || componentType == 2 || componentType == 3)
            this.componentType = componentType;
        throw new IllegalArgumentException("Sim.Component Type should be 1,2 or 3");
    }

    public int getComponentType() {
        return this.componentType;
    }
}
