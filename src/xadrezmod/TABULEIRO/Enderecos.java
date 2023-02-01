
package xadrezmod.TABULEIRO;

import xadrezmod.PIECES.Peca;

public class Enderecos
{
    private boolean ocupado;
    private Peca peca;
    
    public Enderecos() 
    {
        this.ocupado = false;
        this.peca = null;
        
    }
    
    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado the ocupado to set
     */
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    /**
     * @return the peca
     */
    public Peca getPeca() {
        return peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    
}
