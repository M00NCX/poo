package xadrezmod.PIECES;

import xadrezmod.Posicao;

public class Cavalo extends Peca {
    
    public Cavalo (int pogX, int pogY, Color cor) {
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\xadrez-main\\src\\xadrezmod\\PIECES\\imgs\\cavalo"+cor+".png");
    }
    
    @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        if( ((poginX -pogfinX) == 1 && (poginY - pogfinY) ==2) || ((poginX - pogfinX)==2 && (poginY - pogfinY)==1) )
        {
            System.out.println("Movimento permitido");
            return true;
        }
        else 
        {
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
}
