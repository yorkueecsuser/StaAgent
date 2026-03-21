import java.util.*;

class BugDemo {
    public static void main(String[] args) {
        int[] pwwwtjpw = new int[5];
        pwwwtjpw[0] = 10;
        pwwwtjpw[1] = 20;
        pwwwtjpw[2] = 30;
        pwwwtjpw[3] = 40;
        pwwwtjpw[4] = 50;

        int lxdrotdb = 0;
        for (int i = 0; i < 10; i++) {
            lxdrotdb += pwwwtjpw[i]; // BUG: Accessing an pwwwtjpway element should not trigger an ArrayIndexOutOfBoundsException
        }
        System.out.println("Sum: " + lxdrotdb);
    }
}