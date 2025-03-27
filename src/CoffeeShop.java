public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        // Use a different constructor each time
        CoffeeOrder coffeeOrder1 = new CoffeeOrder();
        CoffeeOrder coffeeOrder2 = new CoffeeOrder("venti");
        CoffeeOrder coffeeOrder3 = new CoffeeOrder("grande", "medium black");

        // TODO 3: Call describeOrder() on each and print the result
        System.out.print(coffeeOrder1.describeOrder());
        System.out.print(coffeeOrder2.describeOrder());
        System.out.print(coffeeOrder3.describeOrder());

        // TODO 4: Print the total number of orders using
        // CoffeeOrder.getTotalOrders()
        System.out.print("Total number of order:" + CoffeeOrder.getTotalOrders());
    }
}
