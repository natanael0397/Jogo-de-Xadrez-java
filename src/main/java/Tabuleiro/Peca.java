package Tabuleiro;
//é nessa classe aqui que eu vou definir os parametros do jogo de xadrez
//ou seja,é nesta classe aqui que eu vou definir os tamanhos do meu jogo de xadrez
/*Board>Tabuleiro
Position>Posicao
Piece>Peca
ChessPiece>Peca de xadrez
ChessMatch>Partida Xadrez
*/
public class Peca {
    protected Posicao posicao;

    private Tabuleiro tabuleiro;

    //eu vou fazer um construtor,entretanto não com a posicao,já que ela por padrão será nula
    public Peca(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;
        posicao = null;
    }

    //somente classes dentro do mesmo pacote ou subclasses que vão poder acessar o getTabuleiro
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

}
