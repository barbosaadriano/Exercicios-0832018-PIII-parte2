import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menor = 0;
		int maior = 0;
		
		System.out.println("Digite o primeiro número!");
		int tmp1 = scan.nextInt();
		System.out.println("Digite o segundo número!");
		int tmp2 = scan.nextInt();
		if (tmp1 > tmp2) {
			menor = tmp2;
			maior = tmp1;
		} else {
			menor = tmp1;
			maior = tmp2;
		}
		
		for (int i = menor; i <= maior; i++) {
			System.out.printf("Número %d \r\n",i);			
		}
		
	}
	
}