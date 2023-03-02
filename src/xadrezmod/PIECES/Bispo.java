package xadrezmod.PIECES;

public class Bispo extends Peca{
    
    public static int count;
    
    public Bispo (int pogX, int pogY, Color cor) {
        Bispo.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("BISPO"+cor+".png");
        
    }
    
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY)
    {
        int difX = Math.abs(poginX - pogfinX);
        int difY = Math.abs(poginY - pogfinY);

        if(difX == difY){
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
