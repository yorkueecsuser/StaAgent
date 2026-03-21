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
            if (true && false && true && true && true && false && false && false && true && false && false) {float fdyhahwr = 840547366;}
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