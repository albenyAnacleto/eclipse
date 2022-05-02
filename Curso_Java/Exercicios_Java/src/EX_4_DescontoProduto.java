/*
A loja de um shopping estão concedendo 10% de desconto no preço de qualquer produto.
Faça um Algoritimo que a apartir do valor fornecido,
calcule e exiba o preço atual e o preço com desconto.
*/

import javax.swing.JOptionPane;

public class EX_4_DescontoProduto {

    public static void main(String[] args){

        float PrecoAtual, PrecoDesc;

        PrecoAtual = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor do Produto: "));
        PrecoDesc = PrecoAtual * 0.9f;

        JOptionPane.showMessageDialog(null, "Valor do Produto: R$" + PrecoAtual +
                "\r\n" + "Valor com Desconto: R$" + PrecoDesc);
    }
}
