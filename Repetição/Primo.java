package Repetição;
import java.util.Scanner;
public class Primo {
   public static void main(String[] args) {
       Scanner dado = new Scanner(System.in);
       System.out.print("Digite qualquer número inteiro maior que 1: ");
       int num = dado.nextInt();
     
       if (num > 1) {
           boolean ehPrimo = true;
          
           for (int i = 2; i < num; i++) {
               if (num % i == 0) {
                  
                   ehPrimo = false;
                   break;
               }
           }
          
           if (ehPrimo) {
               System.out.println("O número " + num + " é primo.");
           } else {
               System.out.println("O número " + num + " NÃO é primo.");
           }
       } else {
           System.out.println("Valor inválido. O número deve ser maior que 1.");
       }
       dado.close();
   }
}
