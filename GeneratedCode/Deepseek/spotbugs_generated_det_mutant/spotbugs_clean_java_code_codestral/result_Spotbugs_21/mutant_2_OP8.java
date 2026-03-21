import java.lang.Math;

class MinMaxBug {

    public static double showBug(double value) {
        double v = value; // Mutated code: adding a variable 'v' and using it in the expression
        return Math.min(0, Math.max(100, v)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double v = 50; // Mutated code: renaming 'value' to 'v'
        double result = showBug(v);
        System.out.println("Result: " + result);
    }
}