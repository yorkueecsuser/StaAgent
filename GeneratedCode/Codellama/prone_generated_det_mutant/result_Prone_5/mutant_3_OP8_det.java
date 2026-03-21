import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        int[] sgbyqtpw = {1, 2, 3, 4, 5};
        System.out.println(sgbyqtpw.toString()); // BUG: ArrayToString
    }
}