package pizzaAbstract;

/**
 * Created by Gabo on 23/4/2018.
 */
public abstract class Pizza {
    public void cocer(){
        System.out.println("Cocinando");
    }

    public void preparar(){
        System.out.println("Preparando");
    }

    public abstract void servir();

}
