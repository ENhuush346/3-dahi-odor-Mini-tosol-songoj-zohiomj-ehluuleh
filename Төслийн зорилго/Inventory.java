import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showInventory() {
        System.out.println("=== 📋 Агуулах дахь барааны жагсаалт ===");
        for (Product p : products) {
            p.printInfo();
        }
    }
}
