package pizza;

/**
 * Created by Gabo on 23/4/2018.
 */
public class Hawaiana implements Ipizza {
    @Override
    public void cocer() {
        System.out.println("Cocinando Hawaiana");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Hawaiana");
    }
}
