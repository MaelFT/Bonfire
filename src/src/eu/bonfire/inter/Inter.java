package eu.bonfire.inter;

import eu.bonfire.Main;

import javax.swing.*;
import java.awt.*;

public class Inter {

    private Main main;

    public Inter(Main main) {
        this.main = main;
    }

    public void launchInter() {
        JTextArea jta = new JTextArea(20, 50);
        JFrame f = new JFrame("Bonfire");
        String text = "Welcome to our chatbox";
        JTextArea textArea = new JTextArea(text, 5, 10);
        textArea.setPreferredSize(new Dimension(100, 100));
        f.setVisible(true);
        f.setSize(1920, 1080);
        JScrollPane jsp = new JScrollPane(jta);
        f.add(textArea);
        f.add(jsp, BorderLayout.CENTER);
        f.pack();
    }
}
