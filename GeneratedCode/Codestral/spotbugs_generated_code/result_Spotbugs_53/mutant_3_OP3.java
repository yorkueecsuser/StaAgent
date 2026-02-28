class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
        }

        // Mutant code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}