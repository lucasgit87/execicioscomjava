import java.util.Scanner;
import java.util.Locale;
public class Ex02 {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        float n1, n2, media;
        String nome;
        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = ler.nextFloat();
        media = (n1 + n2 + n3) / 3;
        System.out.println("O aluno " + nome + " tem média: " + media);
        ler.close();
    }
    
}
