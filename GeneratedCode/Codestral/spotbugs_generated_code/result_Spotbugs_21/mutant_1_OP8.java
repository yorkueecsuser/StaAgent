class MinMaxBug {

    public static double showBug(double val) {
        return Math.min(0, Math.max(100, val)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double val = 50;
        double res = showBug(val);
        System.out.println("Result: " + res);
    }
}