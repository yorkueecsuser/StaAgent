import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] ucqgzqep = {1, 2, 3};
        System.out.println("HashCode of ucqgzqep: " + demo.showBug(ucqgzqep));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of ucqgzqep: " + java.util.Arrays.hashCode(ucqgzqep));
    }
}