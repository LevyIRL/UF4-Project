package tools;

public class calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("IMPOSSIBLE DIVISION BY 0!");
            return 0;
        }else{
            return a / b;
        }
    }
}
