import java.util.Arrays;

class ArrayHashCode {
    public static void main(String[] args) {
        // BUG: ArrayHashCode
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    }

    public static void showBug() {
        int[] cwxipcat = {1, 2, 3};
        System.out.println(cwxipcat.hashCode()); // prints a hash code based on the identity of the cwxipcatay, not its contents
    }
}