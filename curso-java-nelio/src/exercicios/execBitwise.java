package exercicios;

import java.util.Scanner;

public class execBitwise {
    public static void main(String[] args) {
        int a = 5; // 0000 0101
        int b = 3; // 0000 0011

        System.out.println("Operador Bitwise = AND ('&')");
        System.out.println("Operador Bitwise = XOR ('^')");
        System.out.println("Operador Bitwise = NOT  ('~')");
        System.out.println("Operador Bitwise = Shift  ('&')");
        System.out.println("Operador Bitwise = Shift  ('<<')");
        System.out.println("Operador Bitwise = Shift  (>>')");
        System.out.println("Operador Bitwise = Shift  ('>>>')");


        if ((a & b) != 0) { // Verifica se há pelo menos um bit 1 em comum entre a e b
            System.out.println("a & b: Há pelo menos um bit 1 em comum.");
        } else {
            System.out.println("a & b: Não há bits 1 em comum.");
        }

        if ((a | b) != 0) { // Verifica se há pelo menos um bit 1 em a ou b
            System.out.println("a | b: Há pelo menos um bit 1 em a ou b.");
        } else {
            System.out.println("a | b: Não há bits 1 em a ou b.");
        }

        if ((a ^ b) != 0) { // Verifica se há bits diferentes entre a e b
            System.out.println("a ^ b: Há bits diferentes entre a e b.");
        } else {
            System.out.println("a ^ b: Todos os bits são iguais entre a e b.");
        }

        if (~a != 0) { // Verifica o complemento de a
            System.out.println("~a: Complemento de a é diferente de 0.");
        } else {
            System.out.println("~a: Complemento de a é 0.");
        }

        if ((a << 1) != 0) { // Verifica o deslocamento à esquerda de a
            System.out.println("a << 1: Deslocamento à esquerda de a é diferente de 0.");
        } else {
            System.out.println("a << 1: Deslocamento à esquerda de a é 0.");
        }

        if ((a >> 1) != 0) { // Verifica o deslocamento à direita de a
            System.out.println("a >> 1: Deslocamento à direita de a é diferente de 0.");
        } else {
            System.out.println("a >> 1: Deslocamento à direita de a é 0.");
        }

        if ((a >>> 1) != 0) { // Verifica o deslocamento à direita sem sinal de a
            System.out.println("a >>> 1: Deslocamento à direita sem sinal de a é diferente de 0.");
        } else {
            System.out.println("a >>> 1: Deslocamento à direita sem sinal de a é 0.");
        }
    }

}
