package boletin_4_3;

import javax.swing.JOptionPane;

public class Boletin_4_3 {

    public static void main(String[] args) {

        Circulo obx = new Circulo();

        int boton = Integer.parseInt(JOptionPane.showInputDialog("Inserta un número positivo para calcular el Área e inserta un número negativo para calcular la longitud"));

        if (boton < 0) {
            obx.calcularArea();
        } else {
            obx.calcularLongitud();
        }
    }

}
