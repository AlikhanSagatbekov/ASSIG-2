public class SugarD extends CoffeeDecorator {
    public SugarD(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String description() {
        return coffee.description() + " with Sugar";
    }
}