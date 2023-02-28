package xadrezmod.PIECES;

public class Cavalo extends Peca {
    public static int count;
    public Cavalo (int pogX, int pogY, Color cor) {
        Cavalo.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\APRESENTACAO\\src\\xadrezmod\\PIECES\\imgs\\CAVALO"+cor+".png");
    }
    
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        if( (Math.abs((poginX -pogfinX)) == 1 && Math.abs((poginY - pogfinY)) ==2) || (Math.abs((poginX - pogfinX))==2 && Math.abs((poginY - pogfinY))==1) )
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
