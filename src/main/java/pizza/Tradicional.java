package pizza;

/**
 * Created by Gabo on 23/4/2018.
 */
public class Tradicional implements Ipizza {
    @Override
    public void cocer() {
        System.out.println("Cocinando Tradicional");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Tradicional");
    }
}
