package calcule;

public class AlgerieCalculIGR implements CalculIGR {
    @Override
    public float calculerIGR(float salaireBrutAnnuel) {
        return salaireBrutAnnuel * 0.35f;
    }
}
