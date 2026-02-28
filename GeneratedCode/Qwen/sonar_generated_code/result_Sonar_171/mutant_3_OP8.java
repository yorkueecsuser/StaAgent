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
        }
    }

    // Mutated code with renaming operator
    public static void doSomethingWhichThrowsExceptionMutant() {
        try {
            throw new RuntimeException();
        } finally {
            for (int x = 0; x < 10; x++) { // Renamed 'i' to 'x'
                //...
                if (x == 5) {
                    break; // ignored
                }
            }

            /*... */
            return;      // BUG: Jump statements should not occur in "finally" blocks
        }
    }
}