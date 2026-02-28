class ExceptionNotThrown {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            while (getFalseCondition()) {
                // Unreachable code
            }
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}