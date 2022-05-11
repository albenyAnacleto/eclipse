package Exercicios_Java;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		//Variaveis
		int valor;
		
		//Objeto
		Scanner teclado = new Scanner(System.in); //recebe os dados do teclado digitado pelo usuario.
		//ctrl + shift + f = identação automatica no eclipse
		
		//Entrada
		System.out.println("------ TABUADA ------");
		System.out.println("");
		System.out.print("Digite o Valor da Tabuada: ");
		valor = teclado.nextInt();
		System.out.println("");
		
		//Processamento
		//Estrutura de repeticao "FOR" onde:
		//int i = 0 : iniciando a variavel com valor 0.
		//i <= 10 : indicando fim do laço quando i = 10.
		//i++ : somando mais um a varial 1
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
		
		//Fechar captura do objeto do teclado
		teclado.close();
	}
}
