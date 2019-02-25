package boletin23;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Boletin23 {

    public static void main(String[] args) throws ForaDeRangoExcepcion {
        Queue<Persoa> cola = new ArrayDeque<>();
        Metodos cine = new Metodos();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "**********MENÚ**********\n"
                    + "Introduce una opción:\n"
                    + "1.- Agregar un número de personas a la cola\n"
                    + "2.- Ver cola\n"
                    + "3.- Ver total recaudado\n"
                    + "0.- Salir"));

            switch (opcion) {
                case 1:
                    try {
                        cine.crearCola(cola);
                        break;
                    } catch (ForaDeRangoExcepcion e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                case 2:
                    System.out.println(cola);
                    break;
                case 3:
                    System.out.println("Total recaudado: " + cine.descargarCola(cola) + " euros");
                    break;
            }
        } while (opcion != 0);
    }
}
