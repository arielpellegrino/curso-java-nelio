package mod1;/*

Formula
 area = (b + B)/2.0 * h

 */

public class CalculoTrapezio {
    public static void main(String[] args) {
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        //CASTING

        int X,Y;
        double resultado;

        X = 5;
        Y = 2;

        resultado = (double) X / Y;
        System.out.println(resultado);

    }
}