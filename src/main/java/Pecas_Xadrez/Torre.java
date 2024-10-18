package Pecas_Xadrez;

import Tabuleiro.Tabuleiro;
import Xadrez.Cores;
import Xadrez.Peca_de_Xadrez;

//é nessa classe aqui que eu vou definir os parametros do jogo de xadrez
//ou seja,é nesta classe aqui que eu vou definir os tamanhos do meu jogo de xadrez
/*Board>Tabuleiro
Position>Posicao
Piece>Peca
ChessPiece>Peca de xadrez
ChessMatch>Partida Xadrez
Rook>Torre
*/
public class Torre extends Peca_de_Xadrez {
    public Torre(Tabuleiro tabuleiro, Cores cores) {
        super(tabuleiro, cores);
    }
    @Override
    public String toString(){
        return "T";
    }
}
