package xadrezmod.PIECES;
import static xadrezmod.PIECES.Color.*;

public class Peao extends Peca implements MovimentosEspeciais{

    public Peao(int pogX, int pogY, Color cor){
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\xadrez-main\\src\\xadrezmod\\PIECES\\imgs\\PEAO"+cor+".png");
    }
        
    @Override
    public boolean movimento(int poginX, int poginY, int pogfinX, int pogfinY){
        if((poginY - pogfinY)==1){
            System.out.println("Movimento permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }

    @Override
    public boolean primeiroMov(Color cor) {
        cor = this.getCor();
        if(this.movimento(6, this.getPogY(), 4, this.getPogY())&&cor.equals(BLACK)){
         return true;   
        }
        else if(this.movimento(1, this.getPogY(), 3, this.getPogY())&&cor.equals(WHITE)){
            return true;
        }
        return false;
    }
}
