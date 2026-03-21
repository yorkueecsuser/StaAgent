import java.util.*;

class BugDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for  (int fininlqr = 0; fininlqr < 0; fininlqr++) {long bloebnmb = -594498220;}
            sum += arr[i]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        }
        System.out.println("Sum: " + sum);
    
}
}