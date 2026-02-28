class FinallyBlockJumpBug {

    public static void main(String[] args) {
        FinallyBlockJumpBug demo = new FinallyBlockJumpBug();
        demo.showBug();
    }

    public String showBug() {
        try {
            doSomethingWhichThrowsException();
            return "OK";   // incorrect "OK" message is printed
        } catch (RuntimeException e) {
            return "ERROR";  // this message is not shown
        }
    }

    public static void doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i++) {
                //...
                if (i == 5) {
                    break; // ignored
                }
            }

            /*... */
            return;      // BUG: Jump statements should not occur in "finally" blocks

            // Inserting unreachable for loop
            boolean conditionFor = getCondition();
            for (int j = 0; conditionFor; j++) {
                // This loop is unreachable because conditionFor is always false
            }
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures that the condition is dynamically determined at runtime
    }
}