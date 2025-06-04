import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }
    public void showInventory() {
        for (Product p : products) {
            p.printInfo();
        }
    }
}
