import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] intArray = {1, 2, 3};
        System.out.println("HashCode of intArray: " + demo.showBug(intArray));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of intArray: " + java.util.Arrays.hashCode(intArray));

        // Duplicating an assignment statement without using method invocation
        int[] anotherArray = {4, 5, 6};
        int duplicatedHashCode = java.util.Arrays.hashCode(anotherArray);
        int duplicatedHashCodeCopy = duplicatedHashCode; // Duplicated assignment statement
        System.out.println("Duplicated HashCode of anotherArray: " + duplicatedHashCodeCopy);
    }
}