import java.util.*;

public class Order implements Display {
    private Map<Product, Integer> orderedItem = new HashMap<Product, Integer>();
    private double totalCost;

    public Order(Map<Product, Integer> orderedItem, double totalCost) {
        this.orderedItem = orderedItem;
        this.totalCost = totalCost;

    }

    public Map<Product, Integer> getOrderItems() {
        return orderedItem;
    }

    public double getTotalOrderCost() {
        return totalCost;
    }

    public void display() {

        System.out.printf("\nYou have ordered : %d items and the total cost is : %.2f\n", orderedItem.size(),
                totalCost);
    }

}
