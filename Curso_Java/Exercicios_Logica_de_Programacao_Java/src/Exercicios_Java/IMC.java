/*
Desenvolva uma aplicação no console(terminal) para
calcular o valor do IMC.
O aplicativo devera exibir alem do valor do IMC a 
classificação de acordo com a tabela abaixo;

Tabela:
abaixo de 18,5: abaixo do peso
entre 18,6 e 24,9: peso ideal
entre 25,0 e 29,9: levemente acima do peso
entre 30,0 e 34,9: Obesidade grau 1
entre 35,0 e 39,0: Obesidade grau 2 (severa)
acima de 40: Obesidade grau 3 (mórbida)

Formula:
IMC = peso / (altura * altura)

Variáveis: peso, altura, imc (double)
Entrada: peso, altura
Processamento: imc = peso / (altura * altura)
Saída: imc
*/

package Exercicios_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		// Variaveis
		double peso, altura, imc;

		// Objetos
		Scanner teclado = new Scanner(System.in); // recebe os dados do teclado digitado pelo usuario.
		DecimalFormat formatador = new DecimalFormat("#0.00");// formata as casas decimais.
		System.out.println("Calculo do IMC");
		System.out.println("-----------------------");
		
		//Entrada
		System.out.print("Digite seu Peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite sua Altura: ");
		altura = teclado.nextDouble();
		System.out.println("-----------------------");
		
		//Processamento
		imc = peso / (altura * altura);
		
		//Saída
		System.out.println("O IMC e: " + formatador.format(imc));
		
		//Classificação do IMC
		if(imc < 18.5) {
			System.out.println("O IMC e: " + formatador.format(imc) + " - Abaixo do Peso");
		} else if (imc < 25) {
			System.out.println("O IMC e: " + formatador.format(imc) + " - Peso Ideal");
		} else if (imc < 30) {
			System.out.println("O IMC e: " + formatador.format(imc) + " - Levemente acima do Peso");
		} else if (imc < 35) {
			System.out.println("O IMC e: " + formatador.format(imc) + " - Obesidade Grau 1");
		} else if (imc < 40) {
			System.out.println("O IMC e: " + formatador.format(imc) + " - Obesidade Grau 2 (severa)");
		} else {
			System.out.println("O IMC e: " + formatador.format(imc) + " - Obesidade Grau 3 (mórbida)");
		}
		
		/*abaixo de 18,5: abaixo do peso
		entre 18,6 e 24,9: peso ideal
		entre 25,0 e 29,9: levemente acima do peso
		entre 30,0 e 34,9: Obesidade grau 1
		entre 35,0 e 39,0: Obesidade grau 2 (severa)
		acima de 40: Obesidade grau 3 (mórbida)*/
		
		//fechar objeto teclado
		teclado.close();
	}
}
