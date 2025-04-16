package poo.mod2.execClass;

//calculo de dimensões de um trinangulo SEM a utilização de classes
import java.util.Locale;
import java.util.Scanner;

public class execNoPoo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.printf("Entre com as dimensões do trinangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("Entre com as dimensões do trinangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

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
