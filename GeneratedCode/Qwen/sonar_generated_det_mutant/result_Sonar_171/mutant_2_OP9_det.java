class FinallyBlockBug {

    public static void main(String[] args) {
        FinallyBlockBug bugDemo = new FinallyBlockBug();
        bugDemo.showBug();
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
            { int i = 0; do { //...
                if (i == 5) {
                    break; // ignored
                } i++; } while (i < 10); }

            /*... */
            return;      // BUG: Jump statements should not occur in "finally" blocks
        }
    }
}