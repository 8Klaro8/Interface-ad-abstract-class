import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import objects.Pants;
import objects.Product;
import objects.Shirt;
import objects.Shirt.Size;

class Main {
    public static void main(String[] args) {

        try {
            Product[] myProducts = getData();
            Arrays.sort(myProducts);
            printArray(myProducts);
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static Product[] getData() throws FileNotFoundException {
        File textFile = new File("products.txt");
        Scanner fileScanner = new Scanner(textFile);

        ArrayList<Product> myProductArray = new ArrayList<Product>();
        Product[] myArray = new Product[18];
        int lineCounter = -1;

        while (fileScanner.hasNextLine()) {
            lineCounter++;
            String productLine = fileScanner.nextLine();
            String[] splittedProductLine = productLine.split(" ");
            
            if (splittedProductLine[0].equalsIgnoreCase("shirt")) {
                    Shirt newProduct = new Shirt(Shirt.Size.valueOf(splittedProductLine[1]), Double.parseDouble(splittedProductLine[2]), splittedProductLine[3], splittedProductLine[4]);
                    myArray[lineCounter] = newProduct;

            }
            else if (splittedProductLine[0].equalsIgnoreCase("pants")){
                Pants newProduct = new Pants(Integer.parseInt(splittedProductLine[1]), Double.parseDouble(splittedProductLine[2]), splittedProductLine[3], splittedProductLine[4]);
                myArray[lineCounter] = newProduct;
                // myProductArray.add(newProduct);
            }

        }
        fileScanner.close();
        return myArray;
    }
}
