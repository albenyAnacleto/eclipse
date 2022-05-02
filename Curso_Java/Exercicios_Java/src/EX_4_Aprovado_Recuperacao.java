import javax.swing.JOptionPane;

public class EX_4_Aprovado_Recuperacao {
    public static void main(String[] args){
        float prova1, prova2, prova3, media, exame;
        prova1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da 1° Prova: "));
        prova2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da 2° Prova: "));
        prova3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da 3° Prova: "));

        media = (float) (prova1 + prova2 + prova3) / 3;

        if (media >= 7){
            JOptionPane.showMessageDialog(null, "Aprovado com a média: " + media);
        }
        else {
            exame = 10 - media;
            JOptionPane.showMessageDialog(null, "Nota de exame maior ou igual a: " + exame);
        }
    }
}
