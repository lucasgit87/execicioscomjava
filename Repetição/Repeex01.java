package Repetição;
import java.util.Scanner;
public class Repeex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dado = new Scanner(System.in);
		int cont =0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Informe o "+i+" Número: ");
			int n = dado.nextInt();
			if(n>0) {
				cont++;
			}
		}
		System.out.println("Tiveram "+cont+" Números interiros e positivos");
	}
}
