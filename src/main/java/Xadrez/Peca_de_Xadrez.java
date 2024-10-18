package Xadrez;

import Tabuleiro.Peca;
import Tabuleiro.Tabuleiro;
//Por padrão a classe vai reclamar que falta um construtor,
//pois a classe Peca de Xadrez é uma subclasse de Peca

public class Peca_de_Xadrez extends Peca {
    private Cores cores;

    public Peca_de_Xadrez(Tabuleiro tabuleiro, Cores cores) {
        super(tabuleiro);
        this.cores = cores;
    }

    public Cores getCores() {
        return cores;
    }
}
