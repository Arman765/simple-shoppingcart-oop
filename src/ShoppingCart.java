import java.util.*;

public class ShoppingCart implements Display {
    static Map<Product, Integer> cartItems = new HashMap<Product, Integer>();

    public static void addItem(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            cartItems.put(product, currentQuantity + quantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    public static void removeItem(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product);
            if (currentQuantity - quantity > 0) {
                cartItems.put(product, currentQuantity - quantity);
            } else {
                cartItems.remove(product);
            }
        }
    }

    public static void emptyCart() {
        cartItems.clear();
    }

    public static double getTotalCost() {
        double totalCost = 0.0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalCost += (product.getPrice() * quantity);
        }
        return totalCost;
    }

    public static Map<Product, Integer> getCartItems() {
        return cartItems;
    }

    public void display() {
        // current cart situation;

        System.out.println("Your Items: ");

        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(
                    "product-> " + product.getName() + " | " + "Price-> " + product.getPrice() + " | " + "Quantity-> "
                            + quantity
                            + " | " + product.getDescription());
        }

        // System.out.println("Total Cost is :" + getTotalCost());
        System.out.printf("Total Cost is : %.2f\n", getTotalCost());

    }
}