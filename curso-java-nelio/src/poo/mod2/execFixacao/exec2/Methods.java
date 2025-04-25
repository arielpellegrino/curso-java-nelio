package poo.mod2.execFixacao.exec2;

public class Methods {
        String nome;
        double salarioBruto;
        double imposto;
        String aumentoSalario;
        double valorAumento;

        public double calculoSalarioLiquido(){
            return salarioBruto * imposto;
        }

        public double calculaImposto(){
            return salarioBruto * (imposto / 100);
        }

        public double aumentoSalario(String condicao){
            if(condicao.equals("sim")){
               return (this.salarioBruto * this.valorAumento) / 100;
            } else {
                System.out.print("Você não deseja dar um aumento de salario para o profissional :" + this.nome);
                return 0;
            }

        }

}
