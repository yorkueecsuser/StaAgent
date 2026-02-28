class IntComparisonBug {
    public boolean showBug(int value) {
        // Original bug
        boolean originalBug = value == 2147483648L;

        // Mutation: Unreachable if statement
        if (getValue() == 0) {
            System.out.println("This line should never be printed.");
        }

        return originalBug;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}