package employe;

import calcule.CalculIGR;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private CalculIGR calculIGR;

    public Employe(String cin, float salaireBrutMensuel, CalculIGR calculIGR) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
        this.calculIGR = calculIGR;
    }

    public float calculerIGR() {
        float salaireBrutAnnuel = salaireBrutMensuel * 12;
        return calculIGR.calculerIGR(salaireBrutAnnuel);
    }
    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;

    }
    public void setCalculIGR(CalculIGR calculIGR) {
        this.calculIGR = calculIGR;
    }

}
