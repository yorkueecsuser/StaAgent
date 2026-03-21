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
            for (int i = 0; i < 10; i ++) {
                //...
                if (i == 5) {
                    break; // ignored
                }
            boolean bqclfddk = false;while (bqclfddk && false && false && false && true && false && true && true && false && true && true && false) {long gpegffqd = -982136704;}
            }

            //...
        }
    
}

    public void showBug() {
        doSomethingWhichThrowsException(); // BUG: Jump statements should not occur in "finally" blocks
    }
}