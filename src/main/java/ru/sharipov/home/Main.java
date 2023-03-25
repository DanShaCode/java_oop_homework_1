//        1. Создать класс "Товар" (имя цена рейтинг)
//        2. Создать класс "Категория товара" имеющий переменные (имя и массив товаров).
//        3. Создать несколько объектов класса Категория товаров.
//        4. Создать класс "Корзина", она должна содержать массив купленных товаров.
//        5. Создать класс "Пользователь" содержащий поля (логин пароль объект класса "Корзина")
//        6. Вывести на консоль каталог продуктов.
//        7. Вывести в консоль покупки посетителей.
//        (После покупки у пользователя добавляется товар, а из магазина удаляется.)

package ru.sharipov.home;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println(" ----- BEFORE -----");

        // Create and fill food products category
        ProductCategory foodCat = new ProductCategory("Food Products");
        foodCat.addToCategory(
                new Product("Butter", 55.50, 4.5),
                new Product("Milk", 94.80, 4.0),
                new Product("Meat", 122.50, 3.9));
        foodCat.showCategoryProducts();

        // Create and fill electronics products category
        ProductCategory electronicsCat = new ProductCategory("Electronics Products");
        electronicsCat.addToCategory(
                new Product("TV", 56.999, 3.5),
                new Product("Note", 29.999, 3.0),
                new Product("Mobile", 9.999, 2.9));
        electronicsCat.showCategoryProducts();

        // Create and fill cosmetics products category
        ProductCategory cosmeticsCat = new ProductCategory("Cosmetics Products");
        cosmeticsCat.addToCategory(
                new Product("Shampoo", 455.0, 3.5),
                new Product("Pomade", 1499.0, 3.0),
                new Product("Soap", 299.0, 2.9));
        cosmeticsCat.showCategoryProducts();

        // Create a Customer1 in the Shop
        Customer customer1 = new Customer("DanShaCode", 1029384756L);
        customer1.buyProduct(foodCat, "Milk");
        customer1.buyProduct(foodCat, "Butter");

        // Create a Customer2 in the Shop
        Customer customer2 = new Customer("AnnShaDance", 5647382910L);
        customer2.buyProduct(cosmeticsCat, "Pomade");
        customer2.buyProduct(electronicsCat, "Note");

        System.out.println();
        System.out.println(" ----- AFTER -----");

        // Show the basket of the Customer1 and Customer2
        customer1.purchasesInfo();
        customer2.purchasesInfo();

        // Show the category's products after purchases
        foodCat.showCategoryProducts();
        electronicsCat.showCategoryProducts();
        cosmeticsCat.showCategoryProducts();
    }
}