package eu.bonfire.inter;

import eu.bonfire.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Inter {
    private Main main;

    public Inter(Main main) {
        this.main = main;
    }

    public void launchInter() {
        JPanel textPanel= new JPanel();
        JFrame bonfire= new JFrame();
        JLabel textLabel= new JLabel();
        bonfire.setSize(800, 600);
        bonfire.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bonfire.getContentPane().setBackground(Color.black);
        bonfire.setLayout(null);

        bonfire.setVisible(true);

        textPanel = new JPanel();
        textPanel.setBounds(150, 250, 500, 100);
        textPanel.setBackground(Color.blue);
        textLabel = new JLabel();
        textLabel.setBackground(Color.white);
        textPanel.add(textLabel);

    }
}
