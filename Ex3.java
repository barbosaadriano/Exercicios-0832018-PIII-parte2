import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um número para descobrir a sua tabuada!");
		int numero = scan.nextInt();
		System.out.printf("A tabuada do %d é: \r\n",numero);
		for (int i = 1; i <=10; i++) {
			int res = numero * i;
			System.out.printf("%d\tx\t%d\t=\t%d\r\n",numero,i,res);
		}
		
	}	
	
}