package xadrezmod.PIECES;

public class Torre extends Peca implements MovimentosEspeciais{   
    public static int count;
    public Torre(int pogX, int pogY, Color cor) {
        Torre.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("TORRE"+cor+".png");
    }
    
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        if( (poginX == pogfinX && poginY != pogfinY) || (poginX != pogfinX && poginY == pogfinY) )
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

    @Override
    public boolean primeiroMov(int poginX, int pogfinX) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
