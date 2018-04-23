package pizza;

/**
 * Created by Gabo on 23/4/2018.
 */
public class Carne implements Ipizza {
    @Override
    public void cocer() {
        System.out.println("Cocinando Carne");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Carne");
    }
}
