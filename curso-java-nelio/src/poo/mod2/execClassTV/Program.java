package poo.mod2.execClassTV;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity on stock: ");
        product.quantity = sc.nextInt();

        //product.toString()

        //System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Entre com o numero de produtos para serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product);
        System.out.println();

        System.out.print("Entre com o numero de produtos para serem removidos ao estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println();

        sc.close();
    }
}
