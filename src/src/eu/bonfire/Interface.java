package eu.bonfire;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interface extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton submitButton;
    private static JTextArea textArea;

    public Interface() {
        setTitle("bonfire");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        add(textField);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        textArea = new JTextArea(20, 20);
        textArea.setEditable(false);
        add(textArea);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String text = textField.getText();
            textArea.append(text + "\n");
            textField.setText("");
        }
    }

    public static void instance() {
        Interface bonfire = new Interface();
        bonfire.setVisible(true);
    }

    public static void appendText(String msg) {
        if (msg != null) {
            textArea.append(msg + "\n");
        }
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}