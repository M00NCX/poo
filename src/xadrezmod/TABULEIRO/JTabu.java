/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrezmod.TABULEIRO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import xadrezmod.PIECES.Peca;

/**
 *
 * @author Dry
 */
public class JTabu extends JPanel implements MouseListener{
    private static final Dimension DIMENSAOTAB = new Dimension(660,660);
    
    private final Tabuleiro tabuleiro;

    public JTabu(final Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.desenhaTab();
    }
    
    public void desenhaTab(){       
        this.removeAll();
        this.setLayout(new GridLayout(8,8));
        this.setSize(DIMENSAOTAB);
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                JCasa jCasa;
                Peca peca = this.tabuleiro.getEnd(i, j);
                if(peca == null){
                    jCasa = new JCasa(i,j);
                }else{
                    jCasa = new JCasa(new JPeca(peca));
                }
                if((i+j)%2 == 0){
                    jCasa.setBackground(Color.WHITE);
                }else{
                    jCasa.setBackground(Color.BLACK);
                }
                this.add(jCasa);
                jCasa.addMouseListener(this);
            }
        }
        this.revalidate();
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        JCasa jCasa = (JCasa) e.getSource();
        this.tabuleiro.Jogada(jCasa.getI(), jCasa.getJ());
        this.desenhaTab();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
