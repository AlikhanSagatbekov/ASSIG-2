public class Shop {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        Coffee latte = new Latte();

        Coffee coffeeWithMilk = new MilkDecorator(espresso);
        Coffee coffeeWithSugar = new SugarD(latte);

        System.out.println("Cost of " + coffeeWithMilk.description() + ": $" + coffeeWithMilk.cost());
        System.out.println("Cost of " + coffeeWithSugar.description() + ": $" + coffeeWithSugar.cost());
    }
}
