/*Desenvolva uma aplicação no console(Terminal) que faça a conversão
de temperatura em Fahrenheit para Celsius

Lógica.
Variáveis: c,f(double)
Entrada: f
Processamento: c=(5*(f-32))/9
Saída: c 
*/

package Exercicios_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Convert_temperatura {

	public static void main(String[] args) {
		//variaveis
		double c,f;
		
		//objetos
		Scanner teclado = new Scanner(System.in);//permite a captura de dados via teclado ao terminal.
		DecimalFormat formatador = new DecimalFormat("#0.0");//irá formatar em apenas 1 casa decimal.
		
		//Entrada de Dados		
		System.out.println("Conversão de Temperatura");
	 	System.out.print("Digite a Temparatura em Fahrenheit: ");
	 	f = teclado.nextDouble(); //recebe o valor da temperatura digitado no teclado.
	 	
	 	//Processamento
	 	c = (5*(f-32))/9;
	 	
	 	//Saída
	 	System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C" );
	 	
	 	teclado.close(); // Fecha o objeto teclado..

	}

}
