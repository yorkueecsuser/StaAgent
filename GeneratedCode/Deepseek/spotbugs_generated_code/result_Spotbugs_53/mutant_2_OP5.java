class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // Original bug

            // Mutated code - Unreachable switch statement
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    System.out.println("This line should not be executed");
                    break;
                // More cases can be added as per requirements
            }
        }
    }

    private int getUnreachableValue() {
        return -1; // This value will lead to an unreachable case in the switch statement
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}