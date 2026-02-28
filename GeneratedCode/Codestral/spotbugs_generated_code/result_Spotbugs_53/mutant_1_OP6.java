class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            boolean condition = false;
            for (int i = 0; condition; i++) { // Mutant Code: Unreachable for loop
                System.out.println("This loop is unreachable");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}