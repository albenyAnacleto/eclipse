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
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("");
		System.out.println("Testando comit no repositorio do github 1");
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("");
		System.out.println("Estruturas de Controles");
		System.out.println("");
		System.out.println("Estruturas de Controles Condicionais");
		System.out.println("");
		System.out.println("Exemplo 01 - Uso do IF");
		System.out.println("");
		//sexo = 'F';
		if (sexo == 'M') {
			System.out.println("Alistamento Obrigatório.");			
		}
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplo 02 - Uso do IF ELSE");
		System.out.println("");
		if (idade < 18) {
			System.out.println("Menor de Idade");
		}else {
			System.out.println("Maior de Idade");
		}
		
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplo 03 - Uso do ELSE IF ");
		System.out.println("");
		idade = 18;
		if (idade < 16) {
			System.out.println("Proibido Votar");
		} else if (idade >= 18 && idade <= 70 ) {
			System.out.println("Obrigatorio Votar");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("Voto Facultativo");
		}
		
		//Abaixo uma estrutura diferente, com o mesmo resultado, otimizando o sistema com menos codigo.
		
		idade = 85;
		if (idade < 16) {
			System.out.println("Proibido Votar");
		} else if (idade >= 18 && idade <= 70 ) {
			System.out.println("Obrigatorio Votar");
		} else {
			System.out.println("Voto Facultativo");
		}
		
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplo 04 - Uso do Switch Case ");
		System.out.println("");
		System.out.println("1 - Cadastro de Clientes.");
		System.out.println("2 - Cadastro de Produtos.");
		System.out.println("3 - Relátorios.");
		int opcao = 3;
		switch (opcao){
		case 1:
			System.out.println("Clientes");
			break;
		case 2:
			System.out.println("Produtos");
			break;
		case 3:
			System.out.println("Relátorios");
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("");
		System.out.println("Estruturas de Repetições");
		System.out.println("");		
		System.out.println("Exemplo 05 - Uso do FOR");
		System.out.println("");
		for (int j = 10; j > 0; j--) {
			System.out.println("Hello");//neste exemplo vai ser impresso a palavra "Hello" 10x
		}
		System.out.println("______________________________________");//desenha uma linha separadora
		for (int j = 10; j > 0; j--) {
			System.out.println(j);//neste exemplo vai ser impresso de 10 ate 1
		}
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplo 06 - Uso do FOR - Tabuada");
		
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplo 07 - Uso da Estrutura While");
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;//aqui você incrementa a variavel para evitar um loop infinito.
		}
		
		System.out.println("______________________________________");//desenha uma linha separadora
		System.out.println("Exemplo 08 - Uso da Estrutura Do While");
		char novoJogo;
		do {
			System.out.println("Deseja Jogar novamente (s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
			System.out.println("Game Over");
	}

}
