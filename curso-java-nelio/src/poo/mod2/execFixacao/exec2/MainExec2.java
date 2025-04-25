package poo.mod2.execFixacao.exec2;

import java.util.Scanner;
/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido).
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
 * e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
 */
public class MainExec2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        Methods method = new Methods();

        System.out.print("Digite o nome do funcionário: ");
        method.nome = ler.nextLine();

        System.out.print("Digite seu salario bruto: ");
        method.salarioBruto = ler.nextDouble();

        System.out.print("Digite o valor do imposto: ");
        method.imposto = ler.nextDouble();

        System.out.println("O funcionário "
                                   + method.nome
                                   + ", recebe hoje um total de: R$"
                                   + method.salarioBruto
                                   + ", pagando de imposto um total de: R$"
                                   + method.calculaImposto()
                                   + ", com descontos, sobrando "
                                   + method.calculoSalarioLiquido());
        System.out.println("------------------------------------------------");
        System.out.print("Deseja realizar um aumento de salario para o funcionario?");
        String aumento = ler.toString();

        method.aumentoSalario(aumento);

        ler.close();
    }
}
