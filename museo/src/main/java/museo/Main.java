package museo;

public class Main {
    public static void main(String[] args) {

        Museo museo = new Museo();

        for (int i = 0; i < 20; i++) {
            Turista t = new Turista(i, museo);
            t.start();
        }
    }
}