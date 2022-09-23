package ru.netology.manager;
public class ProductRepository {
Product[] products = new Product[0];

public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
        tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
        }

public Product[] getProducts() {
        return products;
        }

public void deleteById(int id) {
        int countOfIndex = 0;
        for (Product prod : products) {
        if (prod.getId() != id) {
        countOfIndex++;
        }
        }
        Product[] tmp = new Product[countOfIndex];
        int copyToIndex = 0;
        for (Product product : products) {
        if (product.getId() != id) {
        tmp[copyToIndex] = product;
        copyToIndex++;
        }
        }
        products = tmp;
        }
}
