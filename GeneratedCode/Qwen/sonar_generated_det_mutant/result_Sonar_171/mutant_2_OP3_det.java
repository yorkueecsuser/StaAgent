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
            for (int i = 0; i < 10; i++) {
                //...
                if (i == 5) {
                    break; // ignored
                }
            }

            if (true && true && false && false && true && true && true && true && true && true && false) {int snjaziqb = 408079344;}
            /*... */
            return;      // BUG: Jump statements should not occur in "finally" blocks
        }
    
}
}