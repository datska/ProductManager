package ru.netology.manager;

public class ProductManager {
    protected ProductRepository repository;

    ProductRepository repo = new ProductRepository();

    public void add(Product product) {
        repo.save(product);
    }

    public Product[] search(String text) {
        int countOfIndex = 0;
        for (Product prod : repo.products) {
            if (prod.getName().contains(text)) {
                countOfIndex++;
            }
        }
        Product[] result = new Product[countOfIndex];
        int count = 0;
        for (Product product : repo.products) {
            if (product.getName().contains(text)) {
                result[count] = product;
                count++;
            }

        }
        return result;
    }

}
