package Tabuleiro;
//a chave peça é protegida,ou seja,eu não quero que ela seja vista
// já que ela é uma posicao simples de matriz
/*Board>Tabuleiro
Position>Posicao
Piece>Peca
* */
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
