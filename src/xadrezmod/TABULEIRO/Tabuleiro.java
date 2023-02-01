package xadrezmod.TABULEIRO;
import xadrezmod.PIECES.*;

public final class Tabuleiro 
{
    private Peca end[][];
    private Color jogadorDaVez = Color.WHITE;
    public static final int tempoDeMovimento = 20000;
    private Peca selecionada = null;
    
    public Tabuleiro() 
    {
        this.end = new Peca[8][8];
             
        Peca torreW1 = new Torre(0, 0, Color.WHITE);
        Peca torreW2 = new Torre(0, 7, Color.WHITE);
        this.adiconaPeca(torreW1);
        this.adiconaPeca(torreW2);
        
        Peca torreB1 = new Torre(7, 0, Color.BLACK);
        Peca torreB2 = new Torre(7, 7, Color.BLACK);
        this.adiconaPeca(torreB1);
        this.adiconaPeca(torreB2);

        Peca cavaloW1 = new Cavalo(0, 1, Color.WHITE);
        Peca cavaloW2 = new Cavalo(0, 6, Color.WHITE);
        this.adiconaPeca(cavaloW1);
        this.adiconaPeca(cavaloW2);

        Peca cavaloB1 = new Cavalo(7, 1, Color.BLACK);
        Peca cavaloB2 = new Cavalo(7, 6, Color.BLACK);
        this.adiconaPeca(cavaloB1);
        this.adiconaPeca(cavaloB2);
        
        Peca bispoW1 = new Bispo(0, 2, Color.WHITE);
        Peca bispoW2 = new Bispo(0, 5, Color.WHITE);
        this.adiconaPeca(bispoW1);
        this.adiconaPeca(bispoW2);

        Peca bispoB1 = new Bispo(7, 2, Color.BLACK);
        Peca bispoB2 = new Bispo(7, 5, Color.BLACK);
        this.adiconaPeca(bispoB1);
        this.adiconaPeca(bispoB2);

        Peca rainhaW = new Rainha(0, 4, Color.WHITE);
        Peca reiW = new Rei(0, 3, Color.WHITE);
        this.adiconaPeca(rainhaW);
        this.adiconaPeca(reiW);

        Peca rainhaB = new Rainha(7, 4, Color.BLACK);
        Peca reiB = new Rei(7, 3, Color.BLACK);
        this.adiconaPeca(rainhaB);
        this.adiconaPeca(reiB);
    
        Peca peaoW0 = new Peao(1, 0, Color.WHITE);
        Peca peaoW1 = new Peao(1, 1, Color.WHITE);
        Peca peaoW2 = new Peao(1, 2, Color.WHITE);
        Peca peaoW3 = new Peao(1, 3, Color.WHITE);
        Peca peaoW4 = new Peao(1, 4, Color.WHITE);
        Peca peaoW5 = new Peao(1, 5, Color.WHITE);
        Peca peaoW6 = new Peao(1, 6, Color.WHITE);
        Peca peaoW7 = new Peao(1, 7, Color.WHITE);
        this.adiconaPeca(peaoW0);
        this.adiconaPeca(peaoW1);
        this.adiconaPeca(peaoW2);
        this.adiconaPeca(peaoW3);
        this.adiconaPeca(peaoW4);
        this.adiconaPeca(peaoW5);
        this.adiconaPeca(peaoW6);
        this.adiconaPeca(peaoW7);

        Peca peaoB0 = new Peao(6, 0, Color.BLACK);
        Peca peaoB1 = new Peao(6, 1, Color.BLACK);
        Peca peaoB2 = new Peao(6, 2, Color.BLACK);
        Peca peaoB3 = new Peao(6, 3, Color.BLACK);
        Peca peaoB4 = new Peao(6, 4, Color.BLACK);
        Peca peaoB5 = new Peao(6, 5, Color.BLACK);
        Peca peaoB6 = new Peao(6, 6, Color.BLACK);
        Peca peaoB7 = new Peao(6, 7, Color.BLACK);
        this.adiconaPeca(peaoB0);
        this.adiconaPeca(peaoB1);
        this.adiconaPeca(peaoB2);
        this.adiconaPeca(peaoB3);
        this.adiconaPeca(peaoB4);
        this.adiconaPeca(peaoB5);
        this.adiconaPeca(peaoB6);
        this.adiconaPeca(peaoB7);
    }
    
  public Peca getEnd(int linha, int coluna){
      return this.end[linha][coluna];      
  }
    
  public void selected(Peca peca){//clicando na peça
      if(peca.isSelected()){
          peca.setSelected(false);
          this.selecionada = null;
      }else{
          peca.setSelected(true);
          this.selecionada = peca;
      }
  }
  
  public void adiconaPeca(Peca peca){
      this.end[peca.getPogX()][peca.getPogY()] = peca;
      peca.setTabuleiro(this);  
  }
    
  public void remvovePeca(Peca peca)
  {
      this.end[peca.getPogX()][peca.getPogY()] = null;
      peca.setTabuleiro(this);  
  }
  
 public void playerT(){//mudando de jogador
     if(this.jogadorDaVez.equals(Color.WHITE)){
         this.jogadorDaVez = Color.BLACK; 
     }else{
         this.jogadorDaVez = Color.WHITE;
     }
 }
  
    /**
     * @return the end
     */
    public Peca[][] getEnd() {
        return end;
    }

    void Jogada(int i, int j) {
        Peca peca = this.getEnd(i, j);
    }
    
  
}    

