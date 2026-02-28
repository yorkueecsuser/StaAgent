import java.lang.RuntimeException;

class Main {
    private static int q = 5;

    public static void main(String[] args) {
        try {
            doSomethingWhichThrowsException();
            System.out.println("OK");   // BUG: Jump statements should not occur in "finally" blocks
        } catch (RuntimeException e) {
            System.out.println("ERROR");  // this message is not shown
        }
    }

    public static void doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            for (int i = 0; i < 10; i ++) {
                //...
                if (q == i) {
                    break; // ignored
                }
            }

            //...
            return;      // Noncompliant - prevents the RuntimeException from being propagated
        }
    }
}