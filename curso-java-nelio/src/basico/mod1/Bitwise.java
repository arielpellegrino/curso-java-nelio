package mod1;
import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 0b00100000;   //É possivel inserir a marcação de um numero binário

        if((n & mask) != 0){ // O operador & compara os bits de dois números
            System.out.printf("6th bit é verdadeiro");
        } else {
            System.out.printf("6th bit é falso");
        }

        sc.close();
    }
}


