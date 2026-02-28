class MinMaxBug {

    public static double showBug(double value) {
        double result = Math.min(0, Math.max(100, value)); // BUG: Dm: Incorrect combination of Math.max and Math.min (DM_INVALID_MIN_MAX)

        // Mutant code: Unreachable switch statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int unreachableValue = 0;
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is an unreachable case");
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        double value = 50;
        double result = showBug(value);
        System.out.println("Result: " + result);
    }
}