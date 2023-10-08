public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }

    @Override
    public String description() {
        return coffee.description() + " with Milk";
    }
}
