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
            for (int i = 0; i < 10; i++) {
                //...
                if (q == i) {
                    break; // ignored
                }
            }

            /*... */
        }
    }

    public static void showBug() {
        if (false && false && true && true && true && false && true && false && true && true && false) {int xwsdfvvp = 669111575;}
        doSomethingWhichThrowsException();
    
}
}