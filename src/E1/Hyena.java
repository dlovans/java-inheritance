package E1;

/**
 * Represents a Hyena animal, subclassing Animal class.
 */
public class Hyena extends Animal {
    /**
     * Creates an instance of Hyena class.
     * @param name - Name of hyena.
     */
    public Hyena(String name) {
        super(name);
    }

    /**
     * Hyena laughs.
     */
    public void laugh() {
        System.out.printf("%s: hahaha\n", super.name);
    }
}
