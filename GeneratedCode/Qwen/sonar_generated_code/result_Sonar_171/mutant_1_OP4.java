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
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This is a reachable if block
                System.out.println("This is a reachable if block");
            } else {
                // This is an unreachable else block due to the dynamic condition
                System.out.println("This is an unreachable else block");
            }
            return;      // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the else block unreachable at runtime
        return false;
    }
}