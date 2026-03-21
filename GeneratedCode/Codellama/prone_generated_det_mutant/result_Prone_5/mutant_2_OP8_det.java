import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        int[] tcjgxfnq = {1, 2, 3, 4, 5};
        System.out.println(tcjgxfnq.toString()); // BUG: ArrayToString
    }
}