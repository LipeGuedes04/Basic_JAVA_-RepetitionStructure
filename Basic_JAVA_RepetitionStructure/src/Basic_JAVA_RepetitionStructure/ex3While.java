// FELIPE GUEDES
// PROGRAMA DE CONTROLE DE QUANTIDADE DE PEDIDOS DE UM POSTO DE GASOLINA, FINALIZANDO O PROGRAMA AO DIGITAR 4
package Basic_JAVA_RepetitionStructure;

import java.util.Scanner;

public class ex3While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Insira qual o tipo de gasolina que vc deseja: ");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
			
		}
		
		
		
	}

