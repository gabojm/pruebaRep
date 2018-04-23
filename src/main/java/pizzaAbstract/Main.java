package pizzaAbstract;

import pizza.*;

/**
 * Created by Gabo on 23/4/2018.
 */
public class Main {
    public static void main (String args[]){
        pizza.FactoryPizza.make("carne").cocer();
    }
}
