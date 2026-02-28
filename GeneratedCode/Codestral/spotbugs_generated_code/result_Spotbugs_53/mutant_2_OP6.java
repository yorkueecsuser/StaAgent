class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");

            // Unreachable for loop
            boolean condition = false;
            for (int i = 0; condition; i++) {
                System.out.println("This line should never be executed");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}