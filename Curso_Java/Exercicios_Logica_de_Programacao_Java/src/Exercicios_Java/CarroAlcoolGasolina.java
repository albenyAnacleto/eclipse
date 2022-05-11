/*
Desenvolva uma aplicação no console(terminal) para
determinar qual é o combustivel mais vantajoso para abastecer.

Para carro flex é preciso ter cautela ao escolher o combustivel na hora 
de abastecer. A principal diferença de preços e vantagens entre os dois
combustiveis esta na proposrção preço x desempenho.

para alcool ser mais vantajoso do que a gasolina, o preço do litro tem que 
custar ate 70% do litro da gasolina.

Variáveis: alcool, gasolina (double)
Entrada: alcool, gasolina
Processamento/Saída: 
if (alcool < 0.7 * gasolina){
	//abastecer com alcool
} else {
	//abastecer com gasolina
}
*/
package Exercicios_Java;

import java.util.Scanner;

public class CarroAlcoolGasolina {

	public static void main(String[] args) {
		
		//Variaveis
		double alcool, gasolina;
		
		//Objetos
		Scanner teclado = new Scanner(System.in); //recebe os dados do teclado digitado pelo usuario.
		//ctrl + shift + f = identação automatica no eclipse
		
		//Entrada
		System.out.println("Alcool x Gasolina");
		System.out.print("Digite o Valor do Alcool: ");
		alcool = teclado.nextDouble();
		
		System.out.print("Digite o Valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		
		//Processamento e Saída
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com Alcool");
		} else {
			System.out.println("Abastecer com Gasolina");
		}
		
		//Fachar objeto teclado
		teclado.close();
	}
}
