import java.io.IOException;
import java.util.*;

public class App {
    static Scanner in = new Scanner(System.in);
    public static List<Product> items = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        // Product product1 = new Product("T-shirt", 19.99, "A comfortable and stylish
        // T-shirt");
        // Product product2 = new Product("Jeans", 49.99, "A durable and fashionable
        // pair of jeans");
        // Product product3 = new Product("Sneakers", 79.99, "A high-quality pair of
        // sneakers");
        // Product product4 = new Product("Shirts", 102.22, "A comfortable and stylish
        // shirt");

        // items.add(product1);
        // items.add(product2);
        // items.add(product3);
        // items.add(product4);

        System.out.println("SHOPPING SYSTEM");

        System.out.println("1.Buy \n2.Exit ");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                Menu.main(null);
                break;
            case 2:
                System.out.println("See you again ! \nThankyou for using this shopping system!");
                System.exit(0);
            default:
                System.out.print("Invalid Choice\n");
        }

        // ShoppingCart cart = new ShoppingCart();
        // cart.addItem(product3, 2);
        // cart.addItem(product1, 3);
        // cart.addItem(product2, 4);

        // cart.display();
        // cart.removeItem(product3, 1);
        // cart.display();

        // Order checkOut1 = new Order(cart.getCartItems(), cart.getTotalCost());
        // checkOut1.display();
        // OrderDetails details = new OrderDetails(checkOut1.getOrderItems(),
        // checkOut1.getTotalOrderCost());
        // details.display(checkOut1.getOrderItems(), checkOut1.getTotalOrderCost());

    }

}
