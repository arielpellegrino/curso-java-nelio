package poo.mod2.membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print(" Entre com o valor do raio: ");
        double radius = sc.nextDouble();

        double c = calc.circunference(radius);

        double v = calc.volume(radius);

        
        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Voume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }



}
