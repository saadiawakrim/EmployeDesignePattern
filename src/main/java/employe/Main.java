package employe;


import calcule.AlgerieCalculIGR;
import calcule.MarocCalculIGR;

public class Main {
    public static void main(String[] args) {
        Employe employeMaroc = new Employe("123456", 3000, new MarocCalculIGR());
        Employe employeAlgerie = new Employe("789012", 5000, new AlgerieCalculIGR());

        System.out.println("IGR Maroc : " + employeMaroc.calculerIGR());
        System.out.println("Salaire Net Maroc : " + employeMaroc.getSalaireNetMensuel());

        System.out.println("IGR Algerie : " + employeAlgerie.calculerIGR());
        System.out.println("Salaire Net Algerie : " + employeAlgerie.getSalaireNetMensuel());
    }
}