import javax.swing.JOptionPane;

public class EX_4_Media {

    public static void main(String[] args){

        float nota1, nota2, nota3, soma, media;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 2: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 3: "));

        soma = nota1 + nota2 + nota3;
        media = soma / 3;

        JOptionPane.showMessageDialog(null, "A Soma das Notas é: " + " " + soma + "\r\n" + "A Média das Notas é: " + media);
    }
}
