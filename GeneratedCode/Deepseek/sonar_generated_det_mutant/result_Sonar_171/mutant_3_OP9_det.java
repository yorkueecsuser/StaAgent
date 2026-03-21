import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        try {
            doSomethingWhichThrowsException(); // BUG: Jump statements should not occur in "finally" blocks
            System.out.println("OK");
        } catch (RuntimeException e) {
            System.out.println("ERROR");
        }
    }

    public static void doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            { int i = 0; do { //...
                if (i == 5) {
                    break; // ignored
                } i ++; } while (i < 10); }

            //...
        }
    }

    public void showBug() {
        doSomethingWhichThrowsException(); // BUG: Jump statements should not occur in "finally" blocks
    }
}