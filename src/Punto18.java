import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Punto18 {
    public static String generateRandomPassword(int len) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int len = 8;
        JOptionPane.showMessageDialog(null, "la contraseña es: "+generateRandomPassword(len));
    }
}
