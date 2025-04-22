package poo.mod2.execFixacao.exec1;
import java.util.Scanner;
/*
* Fazer um programa para ler os valores da largura e altura de um retângulo.
* Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
* Usar uma classe como mostrado no projeto ao lado.
* */



public class MainExec1 {
    public static void main(String[] args){
  
        Scanner ler = new Scanner(System.in);

        Methods method = new Methods();

        System.out.println("Insira os dados do retângulo");
        System.out.println("-----------------------------");
        
        System.out.print("Entre com o valor da altura do retângulo: ");
        method.altura = ler.nextDouble();

        System.out.print("Entre com o valor da largura do retângulo: ");
        method.largura = ler.nextDouble();

        System.out.println("O valor do perimeto é: " + method.calculaArea());
        System.out.println("O valor da diagonal é: " + method.calculaDiagonal());
        System.out.println("O valor do perimetro é: " + method.calculaPerimetro());

        ler.close();
    }
}
