package xadrezmod.PIECES;


public class Rei extends Peca {
    public static int count;
    public Rei(int pogX, int pogY, Color cor){
        Rei.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\APRESENTACAO\\src\\xadrezmod\\PIECES\\imgs\\REI"+cor+".png");
    }
    
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY){
        if((poginX - pogfinX)==1 || (poginY - pogfinY) == 1){
            System.out.println("Moviemnto permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
    
}
