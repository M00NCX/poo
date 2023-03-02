package xadrezmod.PIECES;


public class Rei extends Peca implements MovimentosEspeciais {
    public static int count;
    public Rei(int pogX, int pogY, Color cor){
        Rei.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("REI"+cor+".png");
    }
    
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY){
        int difX = Math.abs(poginX - pogfinX);
        int difY = Math.abs(poginY - pogfinY);
        if(difX==1 || difY == 1){
            System.out.println("Moviemnto permitido");
            return true;
        }else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }

    @Override
    public boolean primeiroMov(int poginX, int pogfinX) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
