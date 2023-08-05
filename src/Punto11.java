import javax.swing.JOptionPane;

public class Punto11 {
    public static void main(String[] args) {
        float a = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de a: "));
        float b = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de b: "));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de c: "));

        float perimetro = a + b + c;
        float semiperimetro = perimetro / 2;
        double Area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        JOptionPane.showMessageDialog(null, "El área del rectangulo es: " + Area);

    }
}
