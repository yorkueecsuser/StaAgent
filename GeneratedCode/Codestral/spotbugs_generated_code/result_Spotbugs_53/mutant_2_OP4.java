class ExceptionNotThrown {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // Original bug: Exception created and dropped rather than thrown
        }

        // Mutant code: Unreachable if-else statement
        boolean falseCondition = getFalseCondition();
        if (falseCondition) {
            System.out.println("This code should never be executed.");
        } else {
            System.out.println("This code is always executed.");
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}