public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Монгол дэлгүүрийн бараанууд
        inventory.addProduct(new Product("Гурил", "Хүнс", 2500, 100));
        inventory.addProduct(new Product("Элсэн чихэр", "Хүнс", 2800, 80));
        inventory.addProduct(new Product("Давс", "Хүнс", 1000, 60));
        inventory.addProduct(new Product("Талх", "Хүнс", 1200, 90));
        inventory.addProduct(new Product("Сүү", "Сүүн бүтээгдэхүүн", 2200, 70));
        inventory.addProduct(new Product("Тараг", "Сүүн бүтээгдэхүүн", 1800, 65));
        inventory.addProduct(new Product("Цай", "Ундаа", 1500, 50));
        inventory.addProduct(new Product("Кофе", "Ундаа", 3500, 40));
        inventory.addProduct(new Product("Өндөг", "Хүнс", 600, 200));
        inventory.addProduct(new Product("Үхрийн мах", "Мах", 15000, 40));
        inventory.addProduct(new Product("Ундаа - Сэндвич", "Ундаа", 1200, 100));
        inventory.addProduct(new Product("Ус - Витсам", "Ундаа", 1000, 150));
        inventory.addProduct(new Product("Ариун цэврийн цаас", "Гэр ахуй", 3000, 30));
        inventory.addProduct(new Product("Гар ариутгагч", "Гэр ахуй", 3500, 25));
        inventory.addProduct(new Product("Шампунь - Dove", "Гэр ахуй", 5000, 40));
        inventory.addProduct(new Product("Саван - Lux", "Гэр ахуй", 1800, 60));
        inventory.addProduct(new Product("Угаалгын нунтаг - Tide", "Гэр ахуй", 8500, 35));
        inventory.addProduct(new Product("Аяга таваг угаагч - Fairy", "Гэр ахуй", 4200, 45));
        inventory.addProduct(new Product("Хиам", "Хүнс", 6500, 50));
        inventory.addProduct(new Product("Бяслаг", "Сүүн бүтээгдэхүүн", 4500, 40));
        inventory.addProduct(new Product("Сүүн шоколад", "Амттан", 2500, 60));
        inventory.addProduct(new Product("Живх - Huggies", "Хүүхдийн бараа", 12000, 20));
        inventory.addProduct(new Product("Шүдний оо - Colgate", "Гэр ахуй", 3500, 55));

        // Агуулахын бүх барааг хэвлэх
        inventory.showInventory();
    }
}

