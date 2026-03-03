package lab5;
import java.util.*;

public class online{

    public static void main(String[] args) {
        ArrayList<Double> orders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n =5;

        System.out.println("Enter order amounts (5):");
        for (int i = 0; i < n; i++) {
            orders.add(sc.nextDouble());
        }
        orders.removeIf(order -> order < 500);

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) > 5000) {
                double discounted = orders.get(i) * 0.90; // 10% discount
                orders.set(i, discounted);
            }
        }
        double totalRevenue = 0;
        for (double order : orders) {
            totalRevenue += order;
        }
        Collections.sort(orders);

        System.out.println("\nTotal Revenue after modifications: " + totalRevenue);
        System.out.println("\nSorted Order:");
        for (double order : orders) {
            System.out.println(order);
        }
    }
}