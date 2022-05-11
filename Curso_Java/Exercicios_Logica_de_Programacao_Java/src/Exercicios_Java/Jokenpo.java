/* JoKenPo - Pedra / Papel / Tesoura.
 * 
 * Escolha opcao do Jogo
 * 1 = Pedra
 * 2 = Papel
 * 3 = Tesoura
 * 
 * Variaveis = (int) jogador, computador.
 * Entrada = jogador, computador.
 * Procesamento / Saída:
 * 
 * Empate:
 * Jogador = 1 | Computador = 1
 * Jogador = 2 | Computador = 2
 * Jogador = 3 | Computador = 3
 * 
 * Jogador Vence:
 * Jogador = 1 | Computador = 3
 * Jogador = 2 | Computador = 1
 * Jogador = 3 | Computador = 2
 * 
 * Computador Vence:
 * Jogador = 1 | Computador = 2
 * Jogador = 2 | Computador = 3
 * Jogador = 3 | Computador = 1 
 * */

package Exercicios_Java;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {

		// Variaveis
		int jogador, computador;

		// Objetos
		Scanner teclado = new Scanner(System.in); // recebe os dados do teclado digitado pelo usuario.
		
		//cabeçalho
		System.out.println("_________JoKenPo________");
		System.out.println("");
		System.out.println(" 1. Pedra ");
		System.out.println(" 2. Papel ");
		System.out.println(" 3. Tesoura ");
		System.out.println("");
		System.out.print("Digita a opcao desejada:  ");
						
		//Logica do jogador
		jogador = teclado.nextInt();
		System.out.println("");
		//exibir a opção sorteada pelo computador.
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default: //caso o usuario informe um numero diferente de 1, 2, 3;
			System.out.println("Opcao Invalida");
			break;
		}
		
		//Logica do computador
		
		/* Função Math.random gera numeros aleatorios não inteiros, assim usamos o (int) para converter em inteiros.
		   multiplicar por 3 gera tres numeros aleatorios apartir do zero ficando assim: 0, 1, 2.
		   adicionamos + 1 ao resuldado para ter certeza que vamos obter a condição = 1, 2, 3, pela função Math.random.*/
		
		computador = (int)(Math.random() * 3 + 1);
		//exibir a opção sorteada pelo computador.
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		
		//Logica para determinar o vencedor.		
		if (jogador == computador) {
			System.out.println("----- EMPATE! -----");
		}else {
			if ((jogador == 1 && computador ==3) || (jogador == 2 && computador == 1) || (jogador ==3 && computador == 2)) {
				System.out.println("----- JOGADOR VENCEU! -----");
			}else {
				System.out.println("----- COMPUTADOR VENCEU! -----");
			}
		}
		
		//fechar teclado
		teclado.close();
	}
}
