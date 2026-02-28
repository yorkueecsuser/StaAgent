class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            do {
                new IllegalArgumentException("x must be nonnegative"); // BUG: Exception created but not thrown
            } while (true);
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}