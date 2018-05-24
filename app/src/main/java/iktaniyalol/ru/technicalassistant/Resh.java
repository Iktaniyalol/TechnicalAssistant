package iktaniyalol.ru.technicalassistant;

public class Resh {
    public static double stepen(double number, double i) {
        double itog = Math.pow(number, i);
        return itog;
    }

    public static double koren(double number, double i) {
        double itog = Math.pow(number, 1.0 / i);
        return itog;
    }

    public static double[] uravkv(double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        double output[] = {x1, x2};
        return output;
    }

    public static double logarifm(double a, double b) {
        double result = Math.log(b) / Math.log(a);
        return result;
    }
}
