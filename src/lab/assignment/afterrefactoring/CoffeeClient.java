package lab.assignment.afterrefactoring;

public class CoffeeClient {
    public static void main(final String[] args) {
        CoffeeMaker starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CappucinoCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();

    }

}
