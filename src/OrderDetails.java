import java.util.Map;

public class OrderDetails extends Order {

    public OrderDetails(Map<Product, Integer> cartItems, double totalCost) {
        super(cartItems, totalCost);

    }

    public void display(Map<Product, Integer> cartItems, double totalCost) {
        System.out.println("\nOrder Details : ");

        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(
                    "product-> " + product.getName() + " | " + "Price-> " + product.getPrice() + " | " + "Quantity-> "
                            + quantity
                            + " | " + product.getDescription());
        }

        // System.out.println("Total Cost is :" + getTotalCost());
        System.out.printf("Total Cost is : %.2f\n", getTotalOrderCost());
    }

}
