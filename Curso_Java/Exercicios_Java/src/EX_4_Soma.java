import javax.swing.JOptionPane;

public class EX_4_Soma {
    public static void main(String[] args){
        int valor1, valor2, valor3, valor4, soma;

        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro Valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo Valor: "));
        valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Terceiro Valor: "));
        valor4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Quarto Valor: "));

        soma = valor1+valor2+valor3+valor4;

        JOptionPane.showMessageDialog(null, "A soma dos quatros valores é: " + soma);

    }
}
