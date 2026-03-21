import java.util.Arrays;

class ArrayHashCode {
    public static void main(String[] args) {
        // BUG: ArrayHashCode
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    }

    public static void showBug() {
        for  (int vdybyhqg = 0; vdybyhqg < 0; vdybyhqg++) {double eqzwqnhb = 82065124;}
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    
}
}