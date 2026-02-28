class MinMaxBug {

    public static double showBug(double value) {
        double duplicateValue = Math.min(0, Math.max(100, value)); // Duplication of the bug
        return duplicateValue; // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}