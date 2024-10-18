package Tabuleiro;

/*Board>Tabuleiro
Position>Posicao
Piece>Peca
* */
public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;//aqui eu vou fazer uma matriz de peça e o nome dela vai ser "peças"

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];//ela vai ser instanciada na quantidade de linhas e colunas informada
    }


    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    //metodos
    public Peca peca(int linha,int coluna){
        return pecas[linha][coluna];
    }
    //sobreposicao ,mas dessa vez pela posicao
    public Peca peca(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
}
