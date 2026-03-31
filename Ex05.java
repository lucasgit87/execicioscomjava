import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ler.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        double raizCubica = Math.cbrt(numero);
        System.out.println("A raiz cúbica de " + numero + " é: " + raizCubica);
        double numeroaoquadrado = Math.pow(numero, 2);
        System.out.println(numero + " elevado ao quadrado é: " + numeroaoquadrado);
        double numeroaoCubo = Math.pow(numero, 3);
        System.out.println(numero + " elevado ao cubo é: " + numeroaoCubo);
       
        ler.close();
    }
}