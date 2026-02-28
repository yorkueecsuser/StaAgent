class ExceptionNotThrown {
    public void showBug(int value) {
        if (value < 0) {
            new IllegalArgumentException("x must be nonnegative"); // original bug is still present
        }
        int y = 10; // new code added to demonstrate renaming
        y++; // using the renamed variable
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}