package Xadrez;

import Pecas_Xadrez.Rei;
import Pecas_Xadrez.Torre;
import Tabuleiro.Tabuleiro;
import Tabuleiro.Posicao;

//é nessa classe aqui que eu vou definir os parametros do jogo de xadrez
//ou seja,é nesta classe aqui que eu vou definir os tamanhos do meu jogo de xadrez
/*Board>Tabuleiro
Position>Posicao
Piece>Peca
ChessPiece>Peca de xadrez
ChessMatch>Partida Xadrez
*/
public class Partida_Xadrez {
    private static Tabuleiro tabuleiro;

    public Partida_Xadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        IniciarPartida();

    }

    //vai ser liberado apenas a classe Peca de Xadrez,por isso eu vou fazer uma matriz(temporária)
    public static Peca_de_Xadrez[][] getpecas() {
        Peca_de_Xadrez[][] mat = new Peca_de_Xadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) ;
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (Peca_de_Xadrez) tabuleiro.peca(i, j);
            }
        }
        return mat;//retorno a minha matriz mat(minha matriz de peça da minha partida de xadrez
    }
    private void IniciarPartida(){
        tabuleiro.localPeca(new Torre(tabuleiro,Cores.BRANCO),new Posicao(2,1));
        tabuleiro.localPeca(new Rei(tabuleiro,Cores.PRETO),new Posicao(0,4));
        tabuleiro.localPeca(new Rei(tabuleiro,Cores.PRETO),new Posicao(7,4));
    }
}
