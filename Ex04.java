import java.util.Scanner;
public class Ex04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Salario base do funcionário: ");
        double salario = ler.nextDouble();
        System.out.println("O salário digitado foi: " + salario);
        double imposto = salario * 0.07;
        double gratificacao = salario * 0.05;
        double salarioareceber = salario + gratificacao - imposto;
        System.out.printf("O salário a receber é: %.2f%n", salarioareceber);
        ler.close();
    }
}