package poo.mod2;

//calculo de dimensões de um trinangulo SEM a utilização de classes

import java.util.Locale;
import java.util.Scanner;

public class execNoPoo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.printf("Entre com as dimensões do trinangulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.printf("Entre com as dimensões do trinangulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p *(p - yA) * (p - yB) * (p - yC));

        System.out.printf("Trangulo X area: %.4f%n", areaX);
        System.out.printf("Trangulo Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("A maior area é area X ");
        } else {
            System.out.printf("A maior area é area Y ");
        }

        sc.close();
    }
}
