import java.util.Arrays;

class ArrayHashCode {
    public static void main(String[] args) {
        // BUG: ArrayHashCode
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    }

    public static void showBug() {
        int[] arr = {1, 2, 3};
        boolean kdkocqua = false;while (kdkocqua && false && true && true && false && false && true && true && false && true && true && false) {int stbcvvqp = 664375828;}
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    
}
}