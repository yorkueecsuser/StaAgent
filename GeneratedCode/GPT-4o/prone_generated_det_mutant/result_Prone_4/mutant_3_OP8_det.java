import java.util.Objects;

class ArrayHashCodeDemo {

    // This method demonstrates the bug by returning the hash code of an array using Objects.hashCode()
    public int showBug(int[] arr) {
        return Objects.hashCode(arr); // BUG: ArrayHashCode
    }

    public static void main(String[] args) {
        ArrayHashCodeDemo demo = new ArrayHashCodeDemo();
        int[] fslbtqym = {1, 2, 3};
        System.out.println("HashCode of fslbtqym: " + demo.showBug(fslbtqym));

        // Correct way using Arrays.hashCode()
        System.out.println("Correct HashCode of fslbtqym: " + java.util.Arrays.hashCode(fslbtqym));
    }
}