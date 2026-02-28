class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            switch(getValue()) { // Mutated code: Unreachable switch statement
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private int getValue() {
        return -1; // Always returns a value that makes the switch statement unreachable
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}