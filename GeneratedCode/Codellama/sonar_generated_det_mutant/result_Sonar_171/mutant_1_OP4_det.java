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
        if (false && false && false && true && true && false && true && true && true && true && false) {float gcdshkrd = -541334948;}else{float wcypiwcp = 568026784;}
        doSomethingWhichThrowsException();
    
}
}