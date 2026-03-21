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
        int uvuoayjf = 0;switch  (uvuoayjf) {case 1:long jsjwhkxa = -173239821;break;default:long mnnrnqoq = -613827849;break;}
        doSomethingWhichThrowsException();
    
}
}