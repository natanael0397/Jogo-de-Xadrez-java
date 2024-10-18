package Xadrez;

import Tabuleiro.Tabuleiro;

//é nessa classe aqui que eu vou definir os parametros do jogo de xadrez
//ou seja,é nesta classe aqui que eu vou definir os tamanhos do meu jogo de xadrez
/*Board>Tabuleiro
Position>Posicao
Piece>Peca
ChessPiece>Peca de xadrez
ChessMatch>Partida Xadrez
*/
public class Partida_Xadrez {
    private Tabuleiro tabuleiro;

    public Partida_Xadrez() {
        tabuleiro = new Tabuleiro(8, 8);

    }

    //vai ser liberado apenas a classe Peca de Xadrez
    public Peca_de_Xadrez[][] getpecas() {
        Peca_de_Xadrez[][] mat = new Peca_de_Xadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];

    }
}
