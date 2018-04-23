package pizza;

/**
 * Created by Gabo on 23/4/2018.
 */
public class FactoryPizza {

    public static Ipizza make(String type){

        Ipizza pizza = null;
        switch (type){
            case "carne":
                pizza = new Carne();
                break;
            case "hawaiana":
                pizza = new Hawaiana();
                break;
            case"tradicional":
                pizza = new Tradicional();
                break;
            default:
                break;
        }
        return pizza;

    }
}
