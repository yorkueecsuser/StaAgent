class StaticField {
    static int x;

    public StaticField(int y) {
        // Original code
        x = y;

        // Mutant code
        boolean condition = getCondition();
        if (condition) {
            // This if block is unreachable as the condition is always false
            System.out.println("This line of code will never be executed.");
        }
    }

    private boolean getCondition() {
        // This method always returns false to ensure the if statement is unreachable
        return false;
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}