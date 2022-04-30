package poo;

import java.util.Random;

public class Carro {
	int ano;
	String cor;
	
	//Primeiro construtor
	public Carro() {
		Random gerador = new Random();//gera um numero aleatorio 
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	//Segundo construtor
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
		
		System.out.println("         ____________    ");
		System.out.println("        /     /  |   \\   ");
		System.out.println(" ______/_____/___|____\\  ");
		System.out.println(" [0[\\\\[0[___   | -  __| ");  
		System.out.println(" \\|___|/, \\|___|_|/, \\ ");
		System.out.println("  \\_ \\\\__/     \\\\___/  ");
	}
	
	void ligar() {
		System.out.println("engine ON.........");
	}
	
	void desligar() {
		System.out.println("engine OFF .");
	}
	
	void acelerar() {
		System.out.println("vrummmmmmmm");
	}		
}
