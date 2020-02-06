package Sim;

/**
 * The type Component.
 */
public class Component {
    private int componentType;

    /**
     * Instantiates a new Component.
     *
     * @param componentType the component type
     */
    public Component(int componentType) {
        setComponentType(componentType);
    }

    /**
     * Sets component type.
     *
     * @param componentType the component type
     */
    public void setComponentType(int componentType) {
        if (componentType == 1 || componentType == 2 || componentType == 3)
            this.componentType = componentType;
        throw new IllegalArgumentException("Sim.Component Type should be 1,2 or 3");
    }

    /**
     * Gets component type.
     *
     * @return the component type
     */
    public int getComponentType() {
        return this.componentType;
    }
}
