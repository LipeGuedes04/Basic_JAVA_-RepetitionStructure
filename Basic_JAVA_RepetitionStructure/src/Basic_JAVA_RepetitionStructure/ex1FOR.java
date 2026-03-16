// FELIPE GUEDES 
// PROGRAMA QUE RECEBE UM VALOR E RETORNA TODOS OS NUMERO IMPAS ATE O VALOR RECEBIDO

package Basic_JAVA_RepetitionStructure;

import java.util.Scanner;

public class ex1FOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int num = sc.nextInt();
		
		System.out.println("Todos os valores Impas ate o numero: " + num);
		for(int x = 0; x < num; x++) {
			
			x = x + 1;
			
			System.out.println(x);		
		}
		
		
		sc.close();

	}

}
