package mod1;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String s1, s2, s3;

        s1 = entrada.nextLine();
        s2 = entrada.nextLine();
        s3 = entrada.nextLine();

        System.out.println("Dados digitados");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}