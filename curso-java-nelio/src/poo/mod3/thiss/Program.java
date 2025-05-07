package poo.mod3.thiss;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Entre com o numero de produtos para serem adicionados ao estoque: ");
        //quantity = sc.nextInt();
        //product.addProducts(quantity);

        System.out.println("Update data: " + product);
        System.out.println();

        System.out.print("Entre com o numero de produtos para serem removidos ao estoque: ");
        //quantity = sc.nextInt();
        //product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println();

        sc.close();
    }
}
