/*
Calcule o tempo de duração de uma ocorrencia, considerando a entrada do periodo inicial e final
por meio de três valores inteiros positivos, que devem representar a hora, o minuto e os segundos
deste ocorrencia. O usuario deverá fornecer os dois periodos e escolher se quer o resultado em hora,
minuto ou segundo
 */

import javax.swing.JOptionPane;

public class EX_4C_Duracao_Ocorrencia {
    public static void main(String[] args){

        int hora_inicio, min_inicio, seg_inicio;
        int hora_fim, min_fim, seg_fim, opcao;
        float tempo;

        hora_inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de início. "));
        min_inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos de início. "));
        seg_inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos de início. "));

        hora_fim = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora do termino. "));
        min_fim = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos do termino. "));
        seg_fim = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos do termino. "));

        opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                Informe a opção de calculo do tempo de duração.\r
                1 - em Horas.\r
                2 - em minutos\r
                3 - em segundos"""));

        switch (opcao) {
            case 1 -> {
                tempo = hora_fim - hora_inicio + (min_fim - min_inicio) / 60f + (seg_fim - seg_inicio) / 3600f;
                JOptionPane.showMessageDialog(null, "Duração de " + tempo + " horas.");
            }
            case 2 -> {
                tempo = (hora_fim - hora_inicio) * 60f + min_fim - min_inicio + (seg_fim - seg_inicio) / 60f;
                JOptionPane.showMessageDialog(null, "Duração de " + tempo + " minutos.");
            }
            case 3 -> {
                tempo = (hora_fim - hora_inicio) * 3600f + (min_fim - min_inicio) * 60f + seg_fim - seg_inicio;
                JOptionPane.showMessageDialog(null, "Duração de " + tempo + " segundos.");
            }
            default -> JOptionPane.showMessageDialog(null, "Opção Incorreta.");
        }
    }
}
