// FELIPE GUEDES 
// PROGRAMA DE LEITURA DE COORDENADAS, RECEBE O VALOR DE X,Y E VERIFICA EM QUAL QUADRANTE QUE SE ENCONTRA O PONTO DA COORDENADA.

package Basic_JAVA_RepetitionStructure;

import java.util.Scanner;

public class ex2While {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de X:");
		int x = sc.nextInt();
		System.out.println("Digite o valor de Y:");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro\n");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo\n");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro\n");
			}
			else {
				System.out.println("quarto\n");
			}
			System.out.println("Digite o valor de X:");
			x = sc.nextInt();
			System.out.println("Digite o valor de Y:");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}

