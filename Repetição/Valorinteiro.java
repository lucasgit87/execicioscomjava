package Repetição;
import java.util.Scanner;
public class Valorinteiro {
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
     
       System.out.print("Quantos valores você deseja inserir? ");
       int n = ler.nextInt();
   
       for (int i = 0; i < n; i++) {
           System.out.print("Digite um valor inteiro e positivo: ");
           int valor = ler.nextInt();
         
           long fatorial = 1;
           for (int j = 1; j <= valor; j++) {
               fatorial *= j;
           }
           System.out.println("Valor lido: " + valor + " | Fatorial: " + fatorial);
       }
       ler.close();
   }
}
