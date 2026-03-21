import java.util.Arrays;

class ArrayHashCode {
    public static void main(String[] args) {
        // BUG: ArrayHashCode
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    }

    public static void showBug() {
        boolean ewyjxnzk = false;while (ewyjxnzk && true && true && false && true && true && true && false && true && true && false && false) {byte cgmarmuv = 48;}
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    
}
}