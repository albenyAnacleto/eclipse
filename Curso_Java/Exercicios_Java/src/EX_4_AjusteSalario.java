/*
Uma empresa concederá um reajuste salarial de 8,75% no próximo mês,
Elaborar um algoritimo apartir de dados inseridos, calcule o salario reajustado,
exibindo o nome do funcionario, valor do salario atual e o valor do salario reajustado.
*/
import javax.swing.JOptionPane;

public class EX_4_AjusteSalario {

    public static void main(String[] args){

        String nome;
        float SalarioAtual, SalarioNovo;

        nome = JOptionPane.showInputDialog("Informe o nome do Funcionário: ");
        SalarioAtual = Float.parseFloat(JOptionPane.showInputDialog("Informe o Salário atual: R$"));
        SalarioNovo = (float) (SalarioAtual * 1.0875);

        JOptionPane.showMessageDialog(null, "Colaborador: " + nome +
                "\r\n" + "Salário Atual: R$" + SalarioAtual +
                "\r\n" + "Salário Reajustado: R$" + SalarioNovo);
    }
}
