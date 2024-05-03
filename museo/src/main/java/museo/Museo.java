package museo;

public class Museo {

    private int postiTot = 20;
    private int posti = 0;

    public Museo() {
        this.posti = posti;
        this.postiTot = postiTot;
    }

    public synchronized void entra() {
        while (posti > 4) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        posti++;
        System.out.println("il turista e' entrato");
    }

    public synchronized void esci() {
        posti--;
        notifyAll();
        System.out.println("Il turista e' uscito");
    }
}
