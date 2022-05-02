import javax.swing.JOptionPane;

public class EX_4_GerVendas {

    public static void main(String[] args){

        int Codigo, Quantidade;
        float ValorUnit, ValorTotal;
        String Produto;

        Codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o Código do Produto: "));
        Produto = JOptionPane.showInputDialog("Informe a Descrição do Produto: ");
        Quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade do Produto: "));
        ValorUnit = Float.parseFloat(JOptionPane.showInputDialog("Qual o Valor Unitário? "));

        ValorTotal = Quantidade * ValorUnit;

        JOptionPane.showMessageDialog(null,"Código do Produto: " + Codigo + "\r\n" +
                "Descrição: " + Produto + "\r\n" +
                "Quantidade: " + Quantidade + "\r\n" +
                "Valor Unit.: R$" + ValorUnit + "\r\n" +
                "Valor Total: R$" + ValorTotal );
    }
}
