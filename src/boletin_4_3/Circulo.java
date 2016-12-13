package boletin_4_3;

import javax.swing.JOptionPane;

public class Circulo {

    final double Pi = 3.14;
    double radio;

    public void Circulo() {

    }

    public void Circulo(double radio, double Pi) {
    }

    public void setCirculo() {

    }

    public void getCirculo() {

    }

    public double calcularArea() {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar radio"));

        double area = Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El área del círculo es de " + (area * Pi));

        return area;
    }

    public double calcularLongitud() {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Inserta el radio"));

        double longitud = (2 * Pi * radio);

        JOptionPane.showMessageDialog(null, "La longitud es igual a " + longitud);

        return longitud;
    }
}
