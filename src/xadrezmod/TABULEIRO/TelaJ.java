package xadrezmod.TABULEIRO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Dry
 */
public class TelaJ extends JFrame{
    
    private static final Dimension DIMENSAOMIN = new Dimension(600,600);
    private static final Dimension DIMENSAOMAX = new Dimension(900, 900);
    
    private static JLabel jogVez;
    private Tabuleiro tabuleiro;
    
    public TelaJ(){
        setTitle("ChessMod Game");
        this.tabuleiro = new Tabuleiro();
        this.add(new JTabu(tabuleiro), BorderLayout.CENTER);
        
        
        JPanel painelT = new JPanel();
        jogVez = new JLabel("Jogador atual: WHITE");
        painelT.add(jogVez);
        this.add(painelT, BorderLayout.NORTH);
        
        this.setMinimumSize(DIMENSAOMIN);
        this.setMaximumSize(DIMENSAOMAX);
        
        final JMenuBar tableMenuBar = new JMenuBar();
        barraMenu(tableMenuBar);
        this.setJMenuBar(tableMenuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setBounds(10,10,500,500);
        this.setMaximizedBounds(new Rectangle(700,700));
        this.setVisible(true);
    }
    
    public static void setJogVez(Enum jogV){
        jogVez.setText("Jogador atual: " + jogV);
    }
    
    
    private void barraMenu(final JMenuBar tableMenuBar){
        tableMenuBar.add(createFileMenu());
    }
    
    private JMenu createFileMenu(){
        final JMenu fileMenu = new JMenu("Jogo");
        
        final JMenuItem opcoes = new JMenuItem("Opções");
        opcoes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("COLOCAR UM POP-UP");
        }
        });
        fileMenu.add(opcoes);
        
        final JMenuItem regras = new JMenuItem("Regras");
        regras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("COLOCAR UM POP-UP");
        }
        });
        fileMenu.add(regras);
        
        final JMenuItem sobre = new JMenuItem("Sobre");
        sobre.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("COLOCAR UM POP-UP");
        }
        });
        fileMenu.add(sobre);
        
                
        final JMenuItem sair = new JMenuItem("Sair");
        sair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
        }
        });
        fileMenu.add(sair);
      
        return fileMenu;      
    }
    
}
