package Repetição;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Salario {
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
      
       double salario = 1000.0;
       double percentual = 1.5 / 100;
      
     
       salario += percentual * salario;
      
      
       for (int ano = 2007; ano <= 2026; ano++) {
           percentual *= 2;
           salario += percentual * salario;
       }
      
      
       DecimalFormat df = new DecimalFormat("###,###.00");
       System.out.println("O salário atual em 2026 é: R$ " + df.format(salario));
      
       ler.close();
   }
}
