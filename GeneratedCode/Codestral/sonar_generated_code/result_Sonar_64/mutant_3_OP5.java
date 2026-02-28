class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: Exceptions should not be created without being thrown
            int value = getValue();
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    private int getValue() {
        return -1; // Always return a value that makes the switch statement unreachable
    }
}