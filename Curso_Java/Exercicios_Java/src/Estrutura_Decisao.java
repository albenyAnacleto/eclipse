import javax.swing.JOptionPane;

public class Estrutura_Decisao {
    public static void main(String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

        if (numero % 2 == 1){
            JOptionPane.showMessageDialog(null, "O Número é impar.");
        }
        else {
            JOptionPane.showMessageDialog(null,"O Número é Par.");
        }
    }
}
