/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrezmod;

/**
 *
 * @author adryelle.linhares
 */
public class Regra {
    private Posicao origem;
    private Posicao destino;
    int direcao; //qual o intuito?
    int sentido;

    /**
     * @return the origem
     */
    public Posicao getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(Posicao origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public Posicao getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Posicao destino) {
        this.destino = destino;
    }
}
