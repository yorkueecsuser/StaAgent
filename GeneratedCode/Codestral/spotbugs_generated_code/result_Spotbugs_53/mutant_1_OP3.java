class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // Original bug
        }

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int result = 10 / unreachableCondition; // Bug: Division by zero
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}