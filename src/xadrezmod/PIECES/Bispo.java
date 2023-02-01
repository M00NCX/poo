package xadrezmod.PIECES;

public class Bispo extends Peca{
       
    public Bispo (int pogX, int pogY, Color cor) {
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\xadrez-main\\src\\xadrezmod\\PIECES\\imgs\\BISPO"+cor+".png");
    }
    
    @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        int difX = Math.abs(poginX-pogfinX);
        int difY = Math.abs(poginY-pogfinY);

        
        if(difX==difY)
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
