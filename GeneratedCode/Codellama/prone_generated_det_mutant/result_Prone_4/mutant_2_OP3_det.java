import java.util.Arrays;

class ArrayHashCode {
    public static void main(String[] args) {
        // BUG: ArrayHashCode
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    }

    public static void showBug() {
        if (true && true && true && false && false && false && true && true && true && false && false) {float bwbzkmqu = 336326135;}
        int[] arr = {1, 2, 3};
        System.out.println(arr.hashCode()); // prints a hash code based on the identity of the array, not its contents
    
}
}