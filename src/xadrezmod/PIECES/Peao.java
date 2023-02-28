package xadrezmod.PIECES;
import static xadrezmod.PIECES.Color.*;

public class Peao extends Peca implements MovimentosEspeciais{
    public static int count;
    public Peao(int pogX, int pogY, Color cor){
        Peao.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\adryelle.linhares\\Downloads\\CHESS\\CHESS\\XADREZcontador0802\\src\\xadrezmod\\PIECES\\imgs\\PEAO"+cor+".png");
        //System.out.println(count);
    }
        
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY){
        int difY = Math.abs(pogfinY-poginY);        
        int difX = Math.abs(pogfinX-poginX);

        if((difX == 1) && (difY == 0)){
            System.out.println("Movimento permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }

   /* @Override
    public boolean primeiroMov(Color cor) {
        cor = this.getCor();
        if(this.movimentar(6, this.getPogY(), 4, this.getPogY())&&cor.equals(BLACK)){
         return true;   
        }
        else if(this.movimentar(1, this.getPogY(), 3, this.getPogY())&&cor.equals(WHITE)){
            return true;
        }
        return false;
        
    }*/

    @Override
    public boolean primeiroMov(Color cor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
