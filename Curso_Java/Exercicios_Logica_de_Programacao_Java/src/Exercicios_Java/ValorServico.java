/*

Desenvolva uma aplicação no console(terminal) para
calcular o valor da hora de um serviço, de acordo com a 
formula abaixo:

Formula:

       remuneração mensal + impostos + custo operacional + investimentos
hora = _______________________________________________________________
                             Carga horaria mensal de trabalho

Impostos: 30% da remuneraçao mensal.
Investimento: 20% da remuneração mensal.

Variáveis: hora, remunaracao, custo, cargaHoraria (double)
Entrada: remuneracao, custo, cargaHoraria
Processamento: hora = (remuneracao + (remuneracao*0.3) + custo + (remuneraca * 0.2)) / cargaHoraria
Saída: hora
*/

package Exercicios_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		
		//Variáveis
		double hora, remuneracao, custo, cargaHoraria;
		
		//Objetos
		Scanner teclado = new Scanner(System.in); //recebe os dados do teclado digitado pelo usuario.
		DecimalFormat formatador = new DecimalFormat("#0.00");//formata as casas decimais.
		
		//Entrada
		System.out.println("Calculo do Valor de Hora de Serviço");
		System.out.println("--------------------------------------");
		System.out.print("Remuneração Mensal Pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo Operacional Mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga Horaria Mensal de Trabalho: ");
		cargaHoraria = teclado.nextDouble();
		
		//Processamento
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		
		//Saída
		System.out.println("--------------------------------------");
		System.out.println("Valor da Hora: " + formatador.format(hora));
		
		//Fechar teclado
		teclado.close();
		

	}

}
