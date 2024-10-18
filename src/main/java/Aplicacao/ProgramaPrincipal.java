package Aplicacao;
import Tabuleiro.Posicao;
import Xadrez.Partida_Xadrez;

//é nessa classe aqui que eu vou definir os parametros do jogo de xadrez
//ou seja,é nesta classe aqui que eu vou definir os tamanhos do meu jogo de xadrez
/*Board>Tabuleiro
Position>Posicao
Piece>Peca
ChessPiece>Peca de xadrez
ChessMatch>Partida Xadrez
*/
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Partida_Xadrez partidaXadrez = new Partida_Xadrez();
        UI.printTabuleiro(Partida_Xadrez.getpecas());
    }
}
