package mod1;

import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println("-------------");
        int soma = 0;
        for(int i=0; i < N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);
        sc.close();
    }
}