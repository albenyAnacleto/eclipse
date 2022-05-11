/*Desenvolva uma aplicação no console(Terminal) para
calcular o valor da porcentagem usando regra de 3.

Exemplo: x% de y = valor
         10% de 200 = 20
Lógica.

y_____100%
valor_____x%

Variáveis: x,y,valor(double)
Entrada: x,y
Processamento: valor=(x*y)/100
Saída: valor
*/

package Exercicios_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Regra_3 {

	public static void main(String[] args) {
		
		//Variaveis
		double x,y,valor;
		
		//Objetos
		Scanner teclado = new Scanner(System.in); //recebe os dados do teclado digitado pelo usuario.
		DecimalFormat formatador = new DecimalFormat("#0.00");//formata as casas decimais.
		
		//Entrada
		System.out.println("Regra de 3");
		System.out.println("X% de y = Valor");
		System.out.println("Digite o Valor de X: ");
		x = teclado.nextDouble();
		System.out.println("Digite o Valor de Y: ");
		y = teclado.nextDouble();
		
		//Processamento
		valor = (x * y) / 100;
		
		//Saída
		System.out.println(x + " % de" + y + " = " + formatador.format(valor));			
		
		teclado.close();//fecha o objeto teclado.

	}

}
