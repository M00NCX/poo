package xadrezmod.PIECES;

public class Torre extends Peca{   
    public static int count;
    public Torre(int pogX, int pogY, Color cor) {
        Torre.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\APRESENTACAO\\src\\xadrezmod\\PIECES\\imgs\\TORRE"+cor+".png");
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

}
