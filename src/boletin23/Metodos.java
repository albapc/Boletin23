package boletin23;

import java.util.LinkedList;
import java.util.Queue;
import utilidades.PedirDatos;

public class Metodos {

    private Queue<Persoa> cola = new LinkedList<>();
    private float total = 0;

    //agregar por teclado
    public void agregarRandom(Queue<Persoa> cola, int nel) {
        for (int i = 0; i < nel; i++) {
            cola.add(new Persoa());
        }
    }

    //cobra a las personas de la cola segun su edad
    public float descargarCola(Queue<Persoa> cola) {
        Persoa per = cola.poll();
        while (per != null) {
            if (per.getEdade() >= 5 & per.getEdade() <= 10) {
                total = total + 1;
            } else if (per.getEdade() >= 11 & per.getEdade() <= 17) {
                total = total + 2.5f;
            } else {
                total = total + 3.5f;
            }
            per = cola.poll();

        }
        return total;
    }

    //introducimos el numero de personas que queremos que tenga la cola
    public void crearCola(Queue<Persoa> cola) throws ForaDeRangoExcepcion {
        int numElementos = PedirDatos.enteiro("numero de elementos:");
        if (numElementos < 0 || numElementos > 50) {
            throw new ForaDeRangoExcepcion("o numero debe estar entre 0 e 50");
        } else {
            for (int i = 0; i < numElementos; i++) {
                cola.add(new Persoa());
            }
        }
    }
}
