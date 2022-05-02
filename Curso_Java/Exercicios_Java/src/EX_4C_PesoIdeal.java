/*
O posto de atendimento médico e hospitalar de uma cidade atende, em média, 138 pessoas
por dia e vem, ao longo do tempo, observando que os casos de sobrepeso tem aumentado a cada ano.
Sabe-se que o sobrepeso pode interferir de maneira negativa na saúde das pessoas.
Por isso, o posto de atendimento determinou que o médico ou o infermeiro calcule o peso ideal
de todos so pacientes atendidos, devendo ser elaborado um programama que verifique se o paciente está acima
do peso ideal de acordo com as informações abaixo:
Para Homens: (72,7 * altura) - 58;
Para Mulheres: (62,1 * altura) - 44.7;
 */

import javax.swing.JOptionPane;
import java.util.Locale;

public class EX_4C_PesoIdeal {
    public static void main(String[] args){

        float altura, peso_ideal;
        String sexo;

        sexo = JOptionPane.showInputDialog("Informe M - Masculino ou F - Feminino: ");
        sexo = sexo.toUpperCase();

        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a Altura: "));

        if(sexo.equals("M")){
            peso_ideal = (float) ((72.7 * altura)-58);
            JOptionPane.showMessageDialog(null, "O peso ideal é: " + peso_ideal);
        }
        else if (sexo.equals("F")){
            peso_ideal = (float) ((62.1 * altura) -44.7);
            JOptionPane.showMessageDialog(null, "O peso ideal é: " + peso_ideal);
        }
    }
}
