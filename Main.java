import java.util.Arrays;

import objects.Pants;
import objects.Product;
import objects.Shirt;
import objects.Shirt.Size;

class Main {
    public static void main(String[] args) {

        Product[] products = new Product[] {
                new Pants(32,  "JAVA KLEIN", "Blue", 24.99),
                new Pants(34, "JANGLER", "Red", 104.99),
                new Pants(30, "FENDI", "Grey", 119.99),
                new Pants(30, "VERSACE", "Red", 129.99),
                new Pants(29, "JANGLER", "Dark", 99.99),
                new Pants(26, "BELSTAFF", "Indigo", 24.99),
                new Pants(34, "JANGLER", "Red", 104.99),
        };


        Arrays.sort(products);
        printArray(products);


    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
