class FinallyBlockJumpBug {

    public static void main(String[] args) {
        FinallyBlockJumpBug demo = new FinallyBlockJumpBug();
        demo.showBug();
    }

    public String showBug() {
        int status = 0; // New assignment statement
        int statusCopy = status; // Duplicate of the assignment statement

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
        }
    }
}