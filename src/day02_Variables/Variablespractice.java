package day02_Variables;

public class Variablespractice {
    public static void main(String[] args) {
        int salary = 120000;
        double fedralTax = 0.18;
        float stateTax = 0.065f;
        double sumTaxes = fedralTax + stateTax;
        double salaryafterTax = salary * (1-sumTaxes);
        System.out.println(salaryafterTax);

        double r = 5.5;
        double a = r * r * 3.14;
        System.out.println(a);


        double kg = 90;
        double p = kg * 2.25;
        System.out.println(p);


        double l = 1000;
        double lToD = l / 6.15;
        System.out.println(lToD);

        double rupi = 1000000;
        double rTod= rupi * 0.014 ;
        System.out.println(rTod);

        double liter = 10000;
        double galons = liter / 3.7;
        System.out.println(galons);



    }


}
