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
            boolean pmudtlew = false;while (pmudtlew && false && true && false && true && true && false && true && false && true && true && false) {byte secnuyim = 90;}
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