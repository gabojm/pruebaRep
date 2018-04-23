package pizzaAbstract;

import pizza.*;
import pizza.Hawaiana;
import pizza.Tradicional;

/**
 * Created by Gabo on 23/4/2018.
 */
public class FactoryPizza {

    public static Pizza make(String type){
        Pizza pizza =null;
        switch (type){
            case "carne":
                pizza = new Carne();
                break;
            case "hawaiana":
                pizza = new pizzaAbstract.Hawaiana();
                break;
            case"tradicional":
                pizza = new pizzaAbstract.Tradicional();
                break;
            default:
                break;
        }
        return pizza;


    }
}
