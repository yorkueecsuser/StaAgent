class MinMaxBug {

    public static double showBug(double value) {
        return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static boolean getUnreachableCondition() {
        return false; // this method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);

        // Mutant code: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This line is unreachable.");
        }
    }
}