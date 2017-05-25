/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prb;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.omg.CORBA.ORB;

/**
 *
 * @author Carlos
 */
public class principal extends JFrame {

    JTabbedPane pestania;

    public principal() {
        init();
    }
    
    public void init() {
        colocarSkin();
        pestania = new JTabbedPane();
        colocarPestaniasPredeterminadas();
        JPanel pbton = new JPanel();
        JButton restaurar = new JButton("RESTAURAR");
        restaurar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                for (int i = 0; i < pestania.getTabCount(); i++) {
                    pestania.removeTabAt(i);
                }
                colocarPestaniasPredeterminadas();
            }
        });
        pbton.add(restaurar);
        add(pestania);
        add(pbton, BorderLayout.SOUTH);
    }

    public void colocarPestaniasPredeterminadas() {
        JPanel p1 = new JPanel();
        p1.add(new JLabel("JAVA ZONE"));
        JPanel p2 = new JPanel();
        p2.add(new JLabel("JAVA ZONE 2"));
        JPanel p3 = new JPanel();
        p3.add(new JLabel("JAVA ZONE 2"));

        PanelTab btc = new PanelTab(pestania, 0);
        PanelTab btc2 = new PanelTab(pestania, 0);
        PanelTab btc3 = new PanelTab(pestania, 0);

        pestania.addTab("prueba", p1);
        pestania.addTab("prueba", p2);
        pestania.addTab("prueba", p3);

        pestania.setTabComponentAt(0, btc);
        pestania.setTabComponentAt(1, btc2);
        pestania.setTabComponentAt(2, btc3);

    }

    public void colocarSkin() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
    }

    public static void main(String args[]) {
        
        new principal().setVisible(true);
        
    }

}
