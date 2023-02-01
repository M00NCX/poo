package xadrezmod.PIECES;
import xadrezmod.Movimentacao;
import xadrezmod.TABULEIRO. *;

public abstract class Peca {
  
    Color cor;
    private int pogX;
    private int pogY;
    private String imagem; //colocar imagem referente a cada peça
    private Movimentacao mov;
    private boolean selected = false;
    private Tabuleiro tabuleiro;
    
    public abstract boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY); //conferir movimento de cada peça
    
    //getters & setters
    
    public void setColor(Color cor) {
        this.cor = cor;
    }

    /**
     * @param pogX the pogX to set
     */
    public void setPogX(int pogX) {
        this.pogX = pogX;
    }

    /**
     * @param pogY the pogY to set
     */
    public void setPogY(int pogY) {
        this.pogY = pogY;
    }

    /**
     * @param mov the mov to set
     */
    public void setMov(Movimentacao mov) {
        this.mov = mov;
    }

    /**
     * @return the color
     */
    public Color getCor() {
        return cor;
    }

    /**
     * @return the pogX
     */
    public int getPogX() {
        return pogX;
    }

    /**
     * @return the pogY
     */
    public int getPogY() {
        return pogY;
    }

    /**
     * @return the mov
     */
    public Movimentacao getMov() {
        return mov;
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return this.imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
        public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    
}