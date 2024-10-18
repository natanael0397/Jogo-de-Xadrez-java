package Pecas_Xadrez;

import Tabuleiro.Tabuleiro;
import Xadrez.Cores;
import Xadrez.Peca_de_Xadrez;

public class Rei extends Peca_de_Xadrez {
    public Rei(Tabuleiro tabuleiro, Cores cores) {
        super(tabuleiro, cores);
    }

    @Override
    public String toString(){
        return "K";
    }
}
