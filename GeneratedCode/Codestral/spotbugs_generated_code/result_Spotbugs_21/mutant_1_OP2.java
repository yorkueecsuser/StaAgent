class MinMaxBug {

    public static double showBug(double value) {
        double result = Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        double duplicateResult = result; // Mutated code: Duplication of the result assignment
        return result;
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}