package Aplicacao;

import Xadrez.Peca_de_Xadrez;

public class UI {
    public static void printTabuleiro(Peca_de_Xadrez[][] pecas) {
        for (int i = 0; i < pecas.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < pecas.length; j++) {
                printPeca(pecas[i][j]);
            }
            System.out.println();
        }
        System.out.println("a b c d e f g h");
    }

    //metodo auxiliar para imprimir uma peça
    private static void printPeca(Peca_de_Xadrez peca) {
        if (peca == null) {
            System.out.println("-");//se for nulo,significa que não tinha peça no meu tabuleiro
        } else {
            System.out.println(peca);//caso contrário eu imprimo a minha peca
        }
        System.out.println(" ");
    }
}
