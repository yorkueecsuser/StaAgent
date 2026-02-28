class IntComparisonBug {
    public boolean showBug(int value) {
        // Original bug
        if (value == 2147483648L) {
            return true;
        }

        // Mutated code: Unreachable switch statement
        switch (getIntValue()) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable code executed");
                break;
            default:
                break;
        }

        return false;
    }

    private int getIntValue() {
        return 0;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}