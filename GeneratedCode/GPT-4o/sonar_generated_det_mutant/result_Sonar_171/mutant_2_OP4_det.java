class FinallyBlockBug {

    public static void showBug() {
        try {
            doSomethingWhichThrowsException();
            System.out.println("OK");
        } catch (RuntimeException e) {
            System.out.println("ERROR");
        }
    }

    public static void doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            if (false && false && false && false && false && false && true && true && true && true && false) {int pzrdzysj = 550653497;}else{long orsriybh = 665573242;}
            for (int i = 0; i < 10; i++) {
                // Simulating some logic
                if (5 == i) {
                    break;
                }
            }
            return; // BUG: Jump statements should not occur in "finally" blocks
        }
    
}

    public static void main(String[] args) {
        showBug();
    }
}