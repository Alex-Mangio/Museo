package museo;

public class Turista extends Thread {

    private Museo m;

    public Turista(int num, Museo m) {

        this.m = m;
    }

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        try {
            Thread.sleep((int) (Math.random() * 1000) + 2000);
            m.entra();
            Thread.sleep((int) (Math.random() * 1000) + 4000);
            System.out.println("Il turista" + nome + "sta guardando quanto e' bella la Gioconda(degli italiani)");
            System.out.println("Il turista" + nome + "*tutto stupito* e' uscito");
            m.esci();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
