package Repetição;
import java.util.Scanner;
public class Jogadores {
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		int totalJogadores = 11;
		int menoresDe18 = 0;
		int maisDe80kg = 0;
		float somaIdade = 0;
		float somaAltura = 0;
		
		for (int i = 1; i <= totalJogadores; i++) {
			System.out.println("--- Dados do Jogador " + i + " ---");
			
			
			System.out.print("Digite o nome: ");
			String nome = dados.next();
			System.out.print("Digite a idade, mano: ");
			int idade = dados.nextInt();
			System.out.print("Digite o peso ai menor: ");
			float peso = dados.nextFloat();
			System.out.print("Agora digite a altura por gentileza: ");
			float altura = dados.nextFloat();
			
			if (idade < 18) {
				menoresDe18++;
			}
			
			somaIdade += idade;
			
			somaAltura += altura;
			
			if (peso > 80) {
				maisDe80kg++;
			}
			
			System.out.println();
		}
		
		float mediaIdade = somaIdade / totalJogadores;
		float mediaAltura = somaAltura / totalJogadores;
		float porcentagemPeso = ((float) maisDe80kg / totalJogadores) * 100;
		
		System.out.println("======= RESULTADOS FINAL =======");
		System.out.println("Quantidade de jogadores menores de 18 anos: " + menoresDe18);
		System.out.printf("Média das idades dos jogadores: %.2f anos\n", mediaIdade);
		System.out.printf("Média das alturas de todos os jogadores: %.2f m\n", mediaAltura);
		System.out.printf("Porcentagem de jogadores com mais de 80kg: %.2f%%\n", porcentagemPeso);
		dados.close();
	}
}
