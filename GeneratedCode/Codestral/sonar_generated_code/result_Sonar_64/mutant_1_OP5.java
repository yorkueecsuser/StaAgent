class BuggyExceptionCreation {
    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative");
            // Unreachable switch statement
            boolean shouldRun = false;
            int value = getValue();
            switch (value) {
                case 1:
                    // This code will never execute
                    System.out.println("This is an unreachable switch case");
                    break;
            }
        }
    }

    private int getValue() {
        // This method will always return a value that is not 1, making the switch case unreachable
        return 0;
    }
}