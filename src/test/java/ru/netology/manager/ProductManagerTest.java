package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    Product product1 = new Book(365, "Master and Margarita", 1000, "Bulgakov");
    Product product2 = new Book(367, "Masha", 1000, "Masha");
    Product product3 = new Book(364, "Lena", 1000, "Masha");
    Product product4 = new Book(3666, "The second life of Uwe", 1000, "Frederik Buckman");
    Product product5 = new Smartphone(364, "Iphone", 1000, "Apple");
    Product product6 = new Smartphone(378, "Masha and Android", 1000, "Lena");

    ProductManager tmp = new ProductManager();

    @Test
    public void test1() {

        tmp.add(product5);
        tmp.add(product2);
        tmp.add(product4);
        Product[] expected = {product5, product2, product4};
        Product[] actual = tmp.repo.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        tmp.add(product1);
        tmp.add(product2);
        tmp.add(product3);
        tmp.add(product4);
        tmp.add(product5);
        tmp.add(product6);
        Product[] expected = {product2, product6};
        Product[] actual = tmp.search("Masha");
        Assertions.assertArrayEquals(expected, actual);

    }
}
