import java.util.Arrays;

class ArrayEqualsBug {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // BUG: ArrayEquals
        if (array1.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        // Mutant 1: Renaming the variable "array1" to "a"
        if (a.equals(array2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        // Mutant 2: Renaming the variable "array2" to "b"
        if (array1.equals(b)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}