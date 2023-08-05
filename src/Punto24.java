import javax.swing.JOptionPane;

public class Punto24 {
    public static void main(String[] args) {
        String frases = JOptionPane.showInputDialog("Escriba una frase: ");
        String letracambio =JOptionPane.showInputDialog("Cual letra desea cambiar: ");
        String letranueva = JOptionPane.showInputDialog("escriba la letra porque desea cambiarla: ");
        String nuevafrase = frases.replace(letracambio, letranueva);
        JOptionPane.showMessageDialog(null,"la frase actual: "+frases +"\n"+ "la frase con cambios es: "+nuevafrase);
    }
}
