class MinMaxBug {

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static double showBug(double value) {
        for (int i = 0; getUnreachableCondition(); i++) {
            // This loop is unreachable due to the false condition
            System.out.println("This line should never execute.");
        }

        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}