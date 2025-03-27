public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    String size;
    String type;
    private String orderID;
    // - size (String)
    // - type (String)
    // - orderID (String, make this one private)

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders;

    // TODO 4: Create a no-arg constructor
    CoffeeOrder(){
        size = "medium";
        type = "black";
        totalOrders += 1;
    }
    // Set size to "medium" and type to "black"
    // Increment totalOrders

    // TODO 5: Create a constructor that takes a size only
    CoffeeOrder(String size){
        this.size = size;
        type = "black";
        totalOrders += 1;
    }
    // Set type to "black" by default
    // Increment totalOrders

    // TODO 6: Create a constructor that takes size and type
    CoffeeOrder(String size, String type) {
        this.size = size;
        this.type = type;
        totalOrders += 1;
    }

    // Increment totalOrders

    // TODO 7: Create a method describeOrder() that returns
    public String describeOrder(){
        return "Order: " + size + " " + type + "\n";
    }
    // something like "Order: medium black"

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    public static int getTotalOrders(){
        return totalOrders;
    }
}
