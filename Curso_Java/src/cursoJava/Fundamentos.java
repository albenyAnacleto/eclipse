package cursoJava;

/**
 * @author anacleto
 * Fundamentos
 */
public class Fundamentos {

	public static void main(String[] args) {
		String nome = "Albeny";
		int idade = 36;
		char sexo = 'M';
		double temperatura = 26.9;
		boolean arCondicionado = false;
		
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Uso de Variáveis na Linguagem Java");
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplos:");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Codicionado: " + arCondicionado);
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("");//pular uma linha
		
		double i = 10;
		System.out.println("Operadores Arítimetricos e Atribuições.");
		System.out.println("Exemplos: ");
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("i =: " + i);
		System.out.println("i =: " + i + " + 5 | i = " + (i + 5) + "   |  Adição");
		System.out.println("i =: " + i + " - 5 | i = " + (i - 5) + "    |  Subtração");
		System.out.println("i =: " + i + " * 5 | i = " + (i * 5) + "   |  Multiplicação");
		System.out.println("i =: " + i + " / 5 | i = " + (i / 5) + "    |  Divisão");
		System.out.println("i =: " + i + " % 5 | i = " + (i % 5) + "    |  Resto da Divisão");
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("i + = 5      | i = " + (i += 5) + "    |  Adição");
		System.out.println("i - = 5      | i = " + (i -= 5) + "    |  Subtração");
		System.out.println("i * = 5      | i = " + (i *= 5) + "    |  Multiplicação");
		System.out.println("i / = 5      | i = " + (i /= 5) + "    |  Divisão");
		System.out.println("i % = 5      | i = " + (i %= 5) + "     |  Resto da Divisão");
		System.out.println("______________________________________");//desenha uma linha separadora
		i++;//soma 1 a variável
		System.out.println("i++          | i = " + i + "     |  Adição 1 ao Valor");
		i--;//subtrai 1 a variável
		System.out.println("i--          | i = " + i + "     |  Subtrai 1 ao Valor");
	}

}
