import javax.swing.JOptionPane;

public class Punto12 {
    public static boolean esPrimo(int numero) {
        if (numero==0 || numero==1 || numero==4){
            return false;
        }
        for(int i = 2; i<numero/2; i++){
            if(numero % i ==0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int numero =Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));

        JOptionPane.showMessageDialog(null,"El numero es primo? \n"+esPrimo(numero));
    }
}
