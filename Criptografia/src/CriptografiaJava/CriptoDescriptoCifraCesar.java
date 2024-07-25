package CriptografiaJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CriptoDescriptoCifraCesar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Criptografia/Descriptografia - Método Cifra de César");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 2));

            JLabel inputLabel = new JLabel("Texto:");
            JTextField inputField = new JTextField();

            JLabel outputLabel = new JLabel("Resultado:");
            JTextArea outputArea = new JTextArea();
            outputArea.setLineWrap(true);
            outputArea.setWrapStyleWord(true);
            outputArea.setEditable(false);

            JButton encryptButton = new JButton("Criptografar");
            JButton decryptButton = new JButton("Descriptografar");

            panel.add(inputLabel);
            panel.add(inputField);
            panel.add(encryptButton);
            panel.add(decryptButton);
            panel.add(outputLabel);
            panel.add(new JScrollPane(outputArea));

            frame.add(panel, BorderLayout.CENTER);

            encryptButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String inputText = inputField.getText();
                    String encryptedText = encrypt(inputText, 3); // Deslocamento de 3 para criptografia
                    outputArea.setText(encryptedText);
                }
            });

            decryptButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String inputText = inputField.getText();
                    String decryptedText = decrypt(inputText, 3); // Deslocamento de 3 para descriptografia
                    outputArea.setText(decryptedText);
                }
            });

            frame.setVisible(true);
        });
    }

    // Método de criptografia (Cifra de César)
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) ((ch - base + shift) % 26 + base));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Método de descriptografia (Cifra de César)
    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // Descriptografar é criptografar com deslocamento inverso
    }
}
