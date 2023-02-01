package xadrezmod.PIECES;

public class Rainha extends Peca{

        public Rainha(int pogX, int pogY, Color cor){
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\xadrez-main\\src\\xadrezmod\\PIECES\\imgs\\RAINHA"+cor+".png");
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
