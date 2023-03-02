import java.io.IOException;
import java.util.*;

public class Menu {
    static Scanner in = new Scanner(System.in);
    public static List<Product> items = new ArrayList<>();

    static void Items() throws IOException {
        for (Product i : items) {
            System.out.println("\nid: " + i.getId() + " Name: " + i.getName() + " Price: " + i.getPrice());
        }
        Menu.main(null);
    }

    static void Items(int id, int qty) throws IOException {
        for (Product i : items) {
            if (id == i.getId()) {
                System.out.println("\nid: " + i.getId() + "\nName: " + i.getName() + "\nPrice: " + i.getPrice()
                        + "\nDescription: " + i.getDescription());

                ShoppingCart.addItem(i, qty);
                System.out.println(qty + " units of " + " Item " + i.getId() + " added to card");
                Menu.main(null);

            }
        }
        // MainMenu.main(null);
    }

    static void editCart(int id, int qty) throws IOException {
        for (Product i : items) {
            if (id == i.getId()) {

                ShoppingCart.removeItem(i, qty);

            }
        }
        Menu.main(null);
    }

    public static void main(String[] args) throws IOException {

        Product product1 = new Product(1, "T-shirt", 19.43, "A comfortable and stylish T-shirt");
        Product product2 = new Product(2, "Jeans", 49.23, "A durable and fashionable pair of jeans");
        Product product3 = new Product(3, "Sneakers", 79.59, "A high-quality pair of sneakers");
        Product product4 = new Product(4, "Shirts", 102.22, "A comfortable and stylish shirt");

        items.add(product1);
        items.add(product2);
        items.add(product3);
        items.add(product4);

        System.out
                .println("\n1.View All items \n2.Buy Product \n3.View Cart \n4.Edit Cart \n5.Checkout \n6.Exit ");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                Menu.Items();

                break;
            case 2:
                System.out.println("\nEnter item id and Quantity: ");
                int id = in.nextInt();
                int qty = in.nextInt();
                Menu.Items(id, qty);
                break;
            case 3:
                ShoppingCart cart = new ShoppingCart();
                cart.display();
                Menu.main(null);
                break;
            case 4:
                System.out.println("\nEnter item id and Quantity: ");
                int removeId = in.nextInt();
                int removeQty = in.nextInt();
                Menu.editCart(removeId, removeQty);
                break;
            case 5:
                System.out.println("\nThank you for purchasing products from us! See you again !");
                System.out.println("\nYour Orders are : ");
                OrderDetails details = new OrderDetails(ShoppingCart.getCartItems(), ShoppingCart.getTotalCost());
                details.display();
                details.display(ShoppingCart.getCartItems(), ShoppingCart.getTotalCost());

                System.out.println("\nExiting from program..\nThankyou for using this shopping system!");
                System.exit(0);

                break;

            case 6:
                System.out.println("\nExiting from program..\nThankyou for using this shopping system!");
                System.exit(0);
            default:
                System.out.print("\nInvalid Choice\n");
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