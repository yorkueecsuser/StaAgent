class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // Original bug

            // Inserted mutant code
            boolean unreachableCondition = getFalseCondition();
            while (unreachableCondition) {
                // This loop is unreachable because the condition is always false
            }
        }
    }

    public static boolean getFalseCondition() {
        // This method is used to avoid compile-time constant errors and ensure dynamic determination of the condition
        return false;
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}