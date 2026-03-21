import java.util.*;

class BugExample {
    public static void main(String[] args) {
        try {
            doSomethingWhichThrowsException();
            System.out.println("OK"); // incorrect "OK" message is printed
        } catch (RuntimeException e) {
            System.out.println("ERROR"); // this message is not shown
        }
    }

    public static void doSomethingWhichThrowsException() {
        try {
            throw new RuntimeException();
        } finally {
            { int i = 0; do { //...
                if (q == i) {
                    break; // ignored
                } i++; } while (i < 10); }

            /*... */
        }
    }

    public static void showBug() {
        doSomethingWhichThrowsException();
    }
}