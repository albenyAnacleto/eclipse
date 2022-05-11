package Exercicios_Java;

import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		
		//Variaveis
		char opcao = 's';
		
		//Objetos
		Scanner teclado = new Scanner(System.in); //recebe os dados do teclado digitado pelo usuario.
		//ctrl + shift + f = identação automatica no eclipse
		
		//Processamento
		while (opcao == 's') {
			System.out.println("Lançamento do Dado..........");
			int dado = (int) (Math.random() * 6 + 1);//essa função gera numero aleatorios de 0 a 5 e soma +1.
			System.out.println("Face do Dado: " + dado);
			System.out.println("Deseja jogar o Dado novamente (s/n)?: ");
			opcao = teclado.next().charAt(0);//essa função captura apenas a primeira letra digitada.
		}
		
		//fechar objeto teclado
		teclado.close();


	}

}
