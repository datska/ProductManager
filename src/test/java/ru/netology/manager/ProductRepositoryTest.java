package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductRepositoryTest {
    Product product1 = new Book(365, "Master and Margarita", 1000, "Bulgakov");
    Product product2 = new Book(367, "Masha", 1000, "Masha");
    Product product3 = new Book(364, "Lena", 1000, "Masha");
    Product product4 = new Book(3666, "The second life of Uwe", 1000, "Frederik Buckman");
    Product product5 = new Smartphone(364, "Iphone", 1000, "Apple");
    Product product6 = new Smartphone(378, "Masha and Android", 1000, "Lena");

    @Test
    public void test1() {
        ProductRepository tmp = new ProductRepository();
        tmp.save(product5);
        tmp.save(product2);
        tmp.save(product4);
        Product[] expected = {product5, product2, product4};
        Product[] actual = tmp.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        ProductRepository tmp = new ProductRepository();
        tmp.save(product5);
        tmp.save(product1);
        tmp.save(product3);
        tmp.save(product6);
        tmp.save(product5);
        tmp.save(product5);
        tmp.deleteById(364);
        Product[] expected = {product1, product6};
        Product[] actual = tmp.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        ProductRepository tmp = new ProductRepository();
        tmp.save(product5);
        tmp.save(product1);
        tmp.save(product3);
        tmp.save(product6);
        tmp.save(product5);
        tmp.save(product5);
        Product[] expected = {product5, product1, product3, product6, product5, product5};
        Product[] actual = tmp.getProducts();
        Assertions.assertArrayEquals(expected, actual);

    }
}
