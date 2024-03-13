package exercism01;

import exercism01.service.Lasagna;

public class Main {
    public static void main(String... args) {
        Lasagna lasagna = new Lasagna("vitorio");

        System.out.println(lasagna.TempoDePreparo());
        System.out.println(lasagna.TempoDeGasto(2));
        System.out.println(lasagna.TempoRestante(30));
        System.out.println(lasagna.TempoTotalGasto(3,20));
    }
}