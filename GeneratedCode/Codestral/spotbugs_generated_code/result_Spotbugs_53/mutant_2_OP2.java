class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            IllegalArgumentException e = new IllegalArgumentException("x must be nonnegative"); // Mutated code: Duplicate the exception creation
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}