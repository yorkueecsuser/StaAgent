import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
        return array.toString(); // BUG: ArrayToString
    }

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));

        // Mutated code with renaming operator
        int[] b = {1, 2, 3, 4, 5};
        System.out.println("Mutated Output: " + bugDemo.showBug(b));
        System.out.println("Correct Mutated Output: " + Arrays.toString(b));
    }
}