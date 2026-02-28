class MinMaxBug {

    public static double showBug(double value) {
        boolean shouldRun = false; // Mutation: Inserting unreachable if-else branch
        if (shouldRun) {
            return Math.min(0, Math.max(100, value)); // Original buggy code
        } else {
            return value; // Unreachable code
        }
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}