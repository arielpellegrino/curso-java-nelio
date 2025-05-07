package exercicios;

/*
* 🧪 Desafio: Criar uma classe chamada Mensagem
Essa classe terá um metodo chamado enviarMensagem, que será sobrecarga com diferentes tipos de parâmetros.

✅ Regras:
Crie o metodo enviarMensagem() que:
*
Exibe "Enviando mensagem padrão..."
Sobrecargue o metodo para que:
Aceite um String texto e exiba "Enviando mensagem: <texto>"
Aceite um String texto e um int prioridade, exibindo "Mensagem: <texto> (Prioridade: <prioridade>)"
*
* */


public class Sobrecarga {
   public void enviarMensagem(){
       System.out.println("Enviando mensagem padrao");
   }

   public void enviarMensagem(String texto){
       System.out.println("Enviando mensagem: " + texto);
   }

   public void enviarMensagem(String texto, int prioridade){
       System.out.println("Mensagem :" + texto + "(Prioridade :" + prioridade + ")");
   }

   public static void main(String[] args){
       Sobrecarga m = new Sobrecarga();

       m.enviarMensagem();
       m.enviarMensagem("Ola, mundo");
       m.enviarMensagem("Ola mundo", 1);
   }

}
