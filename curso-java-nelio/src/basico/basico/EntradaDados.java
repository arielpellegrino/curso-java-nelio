package basico;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);
        String x;
        int y;
        double z;
        char w;
        x = entrada.next();
        y = entrada.nextInt();
        z = entrada.nextDouble();
        w = entrada.next().charAt(0); // .charAt(0) pega o primeiro caractere de uma string
        System.out.println(x);
        System.out.println(y);
        System.out.println(z); //imprime com o ponto
        System.out.printf("%.2f%n", z); //imprime com a virgula
        System.out.println(w);
        entrada.close();
    }
}