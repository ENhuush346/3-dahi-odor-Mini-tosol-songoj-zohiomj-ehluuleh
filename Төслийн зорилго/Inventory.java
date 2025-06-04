
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showInventory() {
        System.out.println("=== Inventory Product List ===");
        for (Product p : products) {
            p.printInfo();
        }
    }
}
