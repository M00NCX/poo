
package xadrezmod;

public class Regra {
    private Posicao origem;
    private Posicao destino;
    int direcao;
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
