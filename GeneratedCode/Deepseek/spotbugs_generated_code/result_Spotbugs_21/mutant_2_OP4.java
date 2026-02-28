class MinMaxBug {

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static double showBug(double value) {
        if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This should never be printed");
        }
        return Math.min(0, Math.max(100, value)); // Original bug
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}