package mod1;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int x = 5;
        int hora;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12){
            System.out.println("bom dia");
        } else {
            if(hora < 18){
                System.out.println("Boa tarde");
            } else {
                System.out.println("Boa noite");
            }
        }

        sc.close();
    }
}