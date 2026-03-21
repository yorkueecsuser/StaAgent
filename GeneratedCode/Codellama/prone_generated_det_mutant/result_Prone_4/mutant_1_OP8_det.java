import java.util.Arrays;

class ArrayHashCode {
    public static void main(String[] args) {
        // BUG: ArrayHashCode
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    }

    public static void showBug() {
        int[] igpjqaco = {1, 2, 3};
        System.out.println(igpjqaco.hashCode()); // prints a hash code based on the identity of the igpjqacoay, not its contents
    }
}