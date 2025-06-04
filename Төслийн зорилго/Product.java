public class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    public void reduceStock(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Хангалттай нөөц байхгүй байна: " + name);
        }
    }

    public void printInfo() {
        System.out.println("📦 " + name + " | Төрөл: " + category + " | Үнэ: ₮" + price + " | Тоо: " + quantity);
    }
}
