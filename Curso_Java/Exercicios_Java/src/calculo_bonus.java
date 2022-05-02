import javax.swing.JOptionPane;

public class calculo_bonus {
    public static void main(String[] args){

        float salario, bonus;
        int tempo;

        salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Tempo na Empresa: "));

        if (tempo > 5){
            bonus = salario * 0.20f;
        }
        else {
            bonus = salario * 0.10f;
        }

        JOptionPane.showMessageDialog(null, "O Valor do Bônus é R$: " + bonus);

    }
}
