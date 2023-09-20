package m6_oop._2constructors.complex;

public class Passenger {

    private final String name;
    private final int bags;
    private final boolean paidMeal;

    public Passenger(String name) {
        this(name, 0);
    }

    public Passenger(String name, int bags) {
        this(name, bags, false);
    }

    public Passenger(String name, int bags, boolean paidMeal) {
        this.name = validateName(name);
        this.bags = validateBags(bags);
        this.paidMeal = paidMeal;
    }

    private int validateBags(int bags) {
        if (bags < 0) throw new IllegalArgumentException("nope!");
        return bags;
    }

    private String validateName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("nope!");
        return name;
    }
}