class BuggyCode {
    private boolean getFalseCondition() {
        return false; // Method to always return false
    }

    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        // Adding unreachable switch statement
        int value = 0;
        boolean condition = getFalseCondition();
        if (condition) {
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This code should never execute");
                    break;
            }
        }

        return c;
    }
}