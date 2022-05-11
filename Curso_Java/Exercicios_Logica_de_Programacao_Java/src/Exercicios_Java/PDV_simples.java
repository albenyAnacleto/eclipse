/*
Desenvolva uma aplicação de console(Terminal)
de ponto de vendas PDV, conforme abaixo
 
Valor total = 200,00
Desconto(%) = 5
Total com Desconto = 190,00(valor calculado)
Valor Pago = 200,00
Troco = 10,00 (valor calculado)
 
Formula:
  
Total com desconto = Total - Desconto
Troco = Valor Pago - Total com Desconto
   
Variaveis: total, desconto, totaldesconto, valor pago, troco (double).
Entrada1: total, desconto.
Processamento: totaldesconto = total -(desconto * total)/100.
Saída1: totaldesconto
Entrada2: valorpago.
Processamento2: troco = valorpago - totaldesconto.
Saída2: troco. 
*/

package Exercicios_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV_simples {

	public static void main(String[] args) {
		
		// Variaveis
		double total, desconto, totalDesconto, valorPago, troco;
		
		//Objetos
		Scanner teclado = new Scanner(System.in); //recebe os dados do teclado digitado pelo usuario.
		DecimalFormat formatador = new DecimalFormat("#0.00");//formata as casas decimais.
		
		//Entrada1		
		System.out.println("PDV");
		System.out.println("----------------------------");
		System.out.print("Valor Total: ");
		total = teclado.nextDouble(); //recebe o valor da compra digitado no teclado.		
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();//recebe o valor de desconto em % digitado no teclado.
		
		//Processamento1		
		totalDesconto = total - (desconto * total) / 100;
		
		//Saida1
		System.out.println("Total com Desconto: R$ " + formatador.format(totalDesconto));//exibe o valor total da compra com desconto.
				
		//Entrada2
		System.out.println("----------------------------");
		System.out.print("Valor pago em Dinheiro: ");
		valorPago = teclado.nextDouble();//recebe o valor pago em dinheiro digitado no teclado.
		
		//Processamento2
		troco = valorPago - totalDesconto;
		
		//Saida2
		System.out.println("Troco: R$ " + formatador.format(troco));//exibe o valor do troco a ser pago ao cliente.
		System.out.println("----------------------------");		
		
		//Fecha Objeto Teclado.
		teclado.close();
	}
}
