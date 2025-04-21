package poo.mod2.execFixacao.exec1;

public class Methods {
    public double largura;
    public double altura;

    public double calculaArea(){
        return largura * altura;
    }

    public double calculaPerimetro(){
        return 2 * (largura + altura);
    }

    public double calculaDiagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }

}
