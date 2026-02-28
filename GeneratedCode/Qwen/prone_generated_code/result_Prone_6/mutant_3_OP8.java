import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayExample {

    // Method to demonstrate the bug
    public List<int[]> showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);
        return list;
    }

    // Mutated method with renamed variable
    public List<int[]> showBugx(int[] x) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> b = Arrays.asList(x);
        return b;
    }

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayExample example = new ArraysAsListPrimitiveArrayExample();
        int[] array = {1, 2, 3};
        List<int[]> result = example.showBug(array);
        System.out.println("Size of the list: " + result.size()); // This will print 1, not 3
        System.out.println("First element of the list: " + Arrays.toString(result.get(0))); // This will print [1, 2, 3]

        // Testing the mutated method
        int[] y = {4, 5, 6};
        List<int[]> resultx = example.showBugx(y);
        System.out.println("Size of the mutated list: " + resultx.size()); // This will print 1, not 3
        System.out.println("First element of the mutated list: " + Arrays.toString(resultx.get(0))); // This will print [4, 5, 6]
    }
}