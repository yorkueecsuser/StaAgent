class MinMaxBug {

    public static boolean getCondition() {
        return false;  // This method will always return false, making the loop unreachable
    }

    public static double showBug(double value) {
        for (int i = 0; getCondition(); i++) {
            // Unreachable loop
        }
        return Math.min(0, Math.max(100, value)); // Bug: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}