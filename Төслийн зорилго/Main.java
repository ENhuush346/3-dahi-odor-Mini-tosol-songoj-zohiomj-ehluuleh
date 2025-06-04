public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("Flour", "Food", 2500, 100));
        inventory.addProduct(new Product("Sugar", "Food", 2800, 80));
        inventory.addProduct(new Product("Salt", "Food", 1000, 60));
        inventory.addProduct(new Product("Bread", "Food", 1200, 90));
        inventory.addProduct(new Product("Milk", "Dairy Products", 2200, 70));
        inventory.addProduct(new Product("Yogurt", "Dairy Products", 1800, 65));
        inventory.addProduct(new Product("Tea", "Beverages", 1500, 50));
        inventory.addProduct(new Product("Coffee", "Beverages", 3500, 40));
        inventory.addProduct(new Product("Eggs", "Food", 600, 200));
        inventory.addProduct(new Product("Beef", "Meat", 15000, 40));
        inventory.addProduct(new Product("Drink - Sandwich", "Beverages", 1200, 100));
        inventory.addProduct(new Product("Water - Vitsam", "Beverages", 1000, 150));
        inventory.addProduct(new Product("Toilet Paper", "Household", 3000, 30));
        inventory.addProduct(new Product("Hand Sanitizer", "Household", 3500, 25));
        inventory.addProduct(new Product("Shampoo - Dove", "Household", 5000, 40));
        inventory.addProduct(new Product("Soap - Lux", "Household", 1800, 60));
        inventory.addProduct(new Product("Laundry Detergent - Tide", "Household", 8500, 35));
        inventory.addProduct(new Product("Dishwashing Liquid - Fairy", "Household", 4200, 45));
        inventory.addProduct(new Product("Sausage", "Food", 6500, 50));
        inventory.addProduct(new Product("Cheese", "Dairy Products", 4500, 40));
        inventory.addProduct(new Product("Milk Chocolate", "Sweets", 2500, 60));
        inventory.addProduct(new Product("Diapers - Huggies", "Baby Products", 12000, 20));
        inventory.addProduct(new Product("Toothpaste - Colgate", "Household", 3500, 55));

        inventory.showInventory();
    }
}
