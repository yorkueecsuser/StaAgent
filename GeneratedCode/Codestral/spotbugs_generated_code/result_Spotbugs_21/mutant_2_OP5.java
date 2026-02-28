class MinMaxBug {

    public static double showBug(double value) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                break;
        }
        return Math.min(0, Math.max(100, value));  // BUG: DM_INVALID_MIN_MAX
    }

    private static int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}