package E1;

/**
 * Serves as a base abstract class for all animal types.
 */
public abstract class Animal {
    /**
     * Name of animal.
     */
    protected String name;

    /**
     * Creates an instance of Animal.
     * @param name - Name of animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Prints what an animal is eating.
     * @param food - Food item the animal is eating.
     */
    public void eat(String food) {
        System.out.printf("%s eating %s.\n", this.name, food);
    }
}
