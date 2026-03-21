class MinMaxBug {

    public static boolean getUnreachableCondition() {
        return false;
    }

    public static double showBug(double value) {
        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        }
        return Math.min(0, Math.max(100, value)); // Original bug remains
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}