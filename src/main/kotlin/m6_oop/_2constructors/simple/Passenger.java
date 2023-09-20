package m6_oop._2constructors.simple;

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
        this.name = name;
        this.bags = bags;
        this.paidMeal = paidMeal;
    }

    public Passenger(String name, int bags, boolean paidMeal, String thing) {
        this.name = name;
        this.bags = bags;
        this.paidMeal = paidMeal;

        // use the thing
    }
}

