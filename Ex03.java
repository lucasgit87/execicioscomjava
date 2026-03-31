import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do Funcionário: ");
        nome = ler.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        double salario = ler.nextDouble();
        double aumento = salario * 0.25;
        double salarioFinal = salario + aumento;
        System.out.println("O funcionário " + nome + " tem salário final: " + salarioFinal);
        ler.close();
    }
    }