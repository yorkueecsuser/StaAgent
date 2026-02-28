class MinMaxBug {

    public static boolean getCondition() {
        return false;
    }

    public static double showBug(double value) {
        while (getCondition()) { // Unreachable while loop
            System.out.println("This line should never be printed.");
        }
        return Math.min(0, Math.max(100, value)); // Original bug remains
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}