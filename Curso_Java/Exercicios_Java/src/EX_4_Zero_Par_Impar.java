/*
Verifique se um numero digitado é Zero, par ou impar, para isso apresente
uma mensagem mostrando o numero digitado e o resultado do teste.
*/
import javax.swing.JOptionPane;

public class EX_4_Zero_Par_Impar {
        public static void main(String[] args){
            int num1;
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
            if (num1 == 0)
                {
                    JOptionPane.showMessageDialog(null,"O Número Digitado é: " + num1 + " Zero");
                }
                else
                    {
                        if (num1 % 2 == 0)
                            {
                                JOptionPane.showMessageDialog(null, "O Número: " + num1 + " é Par.");
                            }
                            else
                                {
                                    JOptionPane.showMessageDialog(null, "O Número: " + num1 + " é Impar");
                                }
                    }
        }
}
