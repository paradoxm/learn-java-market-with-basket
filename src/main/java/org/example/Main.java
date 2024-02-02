package org.example;


/**
 * This is an e-commerce simulation program that manages products across different
 * categories and handles user purchases.
 */
public class Main {
    public static void main(String[] args) {
        // Создание категории Electronics
        Category electronics = new Category("Electronics");
        Product[] electronicsProducts = {
                new Product("Phone", 200, 5),
                new Product("Laptop", 1000, 4)
        };
        fillCategory(electronics, electronicsProducts);

        // Создание категории Books
        Category books = new Category("Books");
        Product[] booksProducts = {
                new Product("Book1", 20, 5),
                new Product("Book2", 15, 4)
        };
        fillCategory(books, booksProducts);

        // Показ доступных товаров перед покупками
        printCategoryProducts(electronics);
        printCategoryProducts(books);

        // Создание пользователей и добавление в корзину товаров из категорий
        User user1 = new User("user1", "password1");
        user1.getBasket().addProduct(electronicsProducts[0]);
        electronics.removeProduct(electronicsProducts[0]);

        User user2 = new User("user2", "password2");
        user2.getBasket().addProduct(booksProducts[0]);
        books.removeProduct(booksProducts[0]);

        // Показ покупок пользователей
        printUserPurchases(user1);
        printUserPurchases(user2);

        // Показ оставшихся товаров после покупок
        printCategoryProducts(electronics);
        printCategoryProducts(books);
    }

    public static void fillCategory(Category category, Product[] products) {
        for (Product product : products) {
            category.addProduct(product);
        }
    }

    public static void printCategoryProducts(Category category) {
        System.out.println("All products in " + category.getName() + ":");
        for (Product product : category.getProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("==============================================");
    }

    public static void printUserPurchases(User user) {
        System.out.println("Purchased products by " + user.getLogin() + ":");
        for (Product product : user.getBasket().getProducts()) {
            System.out.println(product.getName());
        }
        System.out.println("==============================================");
    }
}