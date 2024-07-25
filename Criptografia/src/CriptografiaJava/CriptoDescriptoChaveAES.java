package CriptografiaJava;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;

public class CriptoDescriptoChaveAES {
    private static final String ALGORITHM = "AES";
    private static SecretKey secretKey;

    public static void main(String[] args) {
        generateKey(); // Gerar a chave AES

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Criptografia/Descriptografia - Método AES");
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
                    try {
                        String inputText = inputField.getText();
                        String encryptedText = encrypt(inputText);
                        outputArea.setText(encryptedText);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });



            decryptButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String inputText = inputField.getText();
                        String decryptedText = decrypt(inputText);
                        outputArea.setText(decryptedText);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });


            frame.setVisible(true);
        });
    }



    // Gerar chave AES
    private static void generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance(ALGORITHM);
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // Método de criptografia AES
    public static String encrypt(String plainText) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }



    // Método de descriptografia AES
    public static String decrypt(String encryptedText) throws Exception {
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }
}

