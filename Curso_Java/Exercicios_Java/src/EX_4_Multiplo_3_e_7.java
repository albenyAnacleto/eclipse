import javax.swing.JOptionPane;

public class EX_4_Multiplo_3_e_7 {

    public static void main(String[] args){
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que zero: "));
        if (num % 3 == 0)
        {
            JOptionPane.showMessageDialog(null,"O número: " + num + " é multiplo de 3.");
        }
        if (num % 7 == 0)
        {
            JOptionPane.showMessageDialog(null, "O número: " + num + " é multiplo de 7.");
        }
        if (num % 3 != 0 && num % 7 != 0)
        {
            JOptionPane.showMessageDialog(null, "O número: " + num + " Não é multiplo de 3 e 7.");
        }
    }
}
