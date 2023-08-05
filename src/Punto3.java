import javax.swing.JOptionPane;

public class Punto3{
    public static void main(String[] args) {
        float radio = Float.parseFloat(JOptionPane.showInputDialog("Digite el radio del circulo: "));
        JOptionPane.showMessageDialog(null, "Perimetro del circulo es: "+(2*Math.PI*radio)+"\n"+"El área del circulo es: "+(Math.PI*Math.pow(radio,2)));
    }
}