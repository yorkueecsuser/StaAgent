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
            { int i = 0; do { // Simulating some logic
                if (5 == i) {
                    break;
                } i++; } while (i < 10); }
            return; // BUG: Jump statements should not occur in "finally" blocks
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}