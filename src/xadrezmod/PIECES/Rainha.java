package xadrezmod.PIECES;

public class Rainha extends Peca{
        public static int count;
        public Rainha(int pogX, int pogY, Color cor){
        Rainha.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\APRESENTACAO\\src\\xadrezmod\\PIECES\\imgs\\RAINHA"+cor+".png");
        }
    
        @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY){
        if((poginX != pogfinX) || (poginY != pogfinY)){
            System.out.println("Moviemnto permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }
}
