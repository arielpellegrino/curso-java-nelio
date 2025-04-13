package mod1;

import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
// System.out.print  não tem quebra de linha no final
// System.out.print  tem quebra de linha no final
// System.out.printf  faz a formatação da String
        double x = 10.2323;

        System.out.print("Hello Worlds");
        System.out.println("Hello Worlds");
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x);
        System.out.println("Resultado = " + x + " METROS");
        System.out.printf("Resultado = %.2f metros%n ", x);
    }
}