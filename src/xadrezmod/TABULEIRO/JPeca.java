/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xadrezmod.TABULEIRO;
import java.awt.Image;
import javax.swing.JLabel;
import xadrezmod.PIECES.*;
import javax.swing.*;

/**
 *
 * @author Dry
 */
public class JPeca extends JLabel{
    private Peca peca;

    public JPeca(Peca peca) {
        this.peca = peca;
        String fig = peca.getImagem();
        ImageIcon icon = new ImageIcon(fig);
        Image img = icon.getImage();
        Image nova = img.getScaledInstance(55, 55, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(nova);
        this.setIcon(icon);
    }

    
    /**
     * @return the peca
     */
    public Peca getPeca() {
        return this.peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(Peca peca) {
        this.peca = peca;
    }
}
