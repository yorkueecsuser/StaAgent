class MinMaxBug {

    public static double showBug(double value) {
        // Introducing a do-while loop with counter
        int counter = 0;
        do {
            // Applying the bug with incorrect combination of Math.max and Math.min
            return Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)
        } while (counter++ < 1);
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}