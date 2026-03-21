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

            boolean qrrcakqz = false;while (qrrcakqz && false && true && true && false && true && true && false && true && false && true && false) {long mdgnwhgp = -601447517;}
            /*... */
            return;      // BUG: Jump statements should not occur in "finally" blocks
        }
    
}
}