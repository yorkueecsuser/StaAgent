class MinMaxBug {

    private static boolean getFalseCondition() {
        return false;
    }

    public static double showBug(double value) {
        if (getFalseCondition()) {
            int switchValue = 1;
            switch (switchValue) {
                case 2:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }
        return Math.min(0, Math.max(100, value)); // Original bug remains
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}