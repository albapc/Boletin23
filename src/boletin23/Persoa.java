package boletin23;

public class Persoa {

    private int edade;

    public Persoa() {
        this.edade = (int) (Math.random() * 60) + 5;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Persoa:" + "edade=" + edade;
    }
}
