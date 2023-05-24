import java.util.ArrayList;

class Item {
    String name;
    double price;
}

class Order {
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;
}

public class TestOrders {
    public static void main(String[] args) {
        // Create item variables
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.50;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 4.25;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 2.75;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 4.00;

        // Create order variables
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Print order1 variable
        System.out.println(order1);

        // Predict what will happen if you print order1.total
        System.out.println(order1.total);

        // Add item1 to order2's item list and increment the order's total
        order2.items = new ArrayList<>();
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappuccino. Add the cappuccino to their order list and to their tab
        order3.items = new ArrayList<>();
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly
        order4.items = new ArrayList<>();
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is now ready. Update her status
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += 2 * item2.price;

        // Jimmy’s order is now ready. Update his status
        order2.ready = true;

        // Print the orders to see the updated information
        System.out.println(order1.name + " - Ready: " + order1.ready);
        System.out.println(order2.name + " - Ready: " + order2.ready);
        System.out.println(order3.name + " - Total: " + order3.total);
        System.out.println(order4.name + " - Total: " + order4.total);
        
    }
}
