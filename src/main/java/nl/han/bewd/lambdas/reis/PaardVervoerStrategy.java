package nl.han.bewd.lambdas.reis;

public class PaardVervoerStrategy {

    public int berekenReistijd(boolean isReisTijdensSpits) {
        if (isReisTijdensSpits) {
            return 200;
        }else{
            return 20;
        }
    }
}
