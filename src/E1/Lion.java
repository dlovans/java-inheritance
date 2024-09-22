package E1;

/**
 * Represents a lion, subclassing Animal class.
 */
public class Lion extends Animal {
    /**
     * Creates an instance of Lion.
     * @param name - Name of lion.
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * Prints lion roaring, then feasting.
     */
    public void roar() {
        System.out.printf("%s: roooar\n", super.name);
        super.eat("chicken");
    }
}
