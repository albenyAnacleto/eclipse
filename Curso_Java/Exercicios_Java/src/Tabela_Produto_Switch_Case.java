import javax.swing.JOptionPane;

public class Tabela_Produto_Switch_Case
{
    public static void main(String[] args)
    {
        String codigo;
        codigo = JOptionPane.showInputDialog("Digite o Código");

        switch (codigo) {
            case "001" -> JOptionPane.showMessageDialog(null, "O Produto é Caderno");
            case "002" -> JOptionPane.showMessageDialog(null, "O Produto é Lápis");
            case "003" -> JOptionPane.showMessageDialog(null, "O Produto é Borracha");
            default -> JOptionPane.showMessageDialog(null, "Diversos");
        }
    }
}


