package xadrezmod.PIECES;

public class Peao extends Peca implements MovimentosEspeciais{
    public static int count;
    public Peao(int pogX, int pogY, Color cor){
        Peao.count++;
        this.setPogX(pogX);
        this.setPogY(pogY);
        this.setColor(cor);
        this.setImagem("C:\\Users\\dry_2\\OneDrive\\Documents\\CHESS\\APRESENTACAO\\src\\xadrezmod\\PIECES\\imgs\\PEAO"+cor+".png");
        //System.out.println(count);
    }
        
    @Override
    public boolean movimentar(int poginX, int poginY, int pogfinX, int pogfinY){
        int difY = Math.abs(pogfinY-poginY);        
        int difX = Math.abs(pogfinX-poginX);

        if((difX == 1) && (difY == 0)||(this.primeiroMov(poginX, pogfinX)&& difY==0)){
            System.out.println("Movimento permitido");
            return true;
        }    
        else{
            System.out.println("Movimento ILEGAL");
            return false;
        }
    }

    @Override
    public boolean primeiroMov(int poginX, int pogfinX) {
        int x = Math.abs(pogfinX-poginX);
        return (poginX==1||poginX==6) && x==2;
    }

}
