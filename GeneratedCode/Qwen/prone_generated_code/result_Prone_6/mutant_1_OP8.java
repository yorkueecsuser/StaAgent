import java.util.Arrays;
import java.util.List;

class ArraysAsListPrimitiveArrayExample {

    // Method to demonstrate the bug
    public List<int[]> showBug(int[] array) {
        // BUG: ArraysAsListPrimitiveArray
        List<int[]> list = Arrays.asList(array);
        return list;
    }

    public static void main(String[] args) {
        ArraysAsListPrimitiveArrayExample example = new ArraysAsListPrimitiveArrayExample();
        int[] array = {1, 2, 3};
        List<int[]> result = example.showBug(array);
        System.out.println("Size of the list: " + result.size()); // This will print 1, not 3
        System.out.println("First element of the list: " + Arrays.toString(result.get(0))); // This will print [1, 2, 3]

        // Mutant code with renaming
        int[] b = {4, 5, 6};
        List<int[]> c = example.showBug(b);
        System.out.println("Size of the mutant list: " + c.size()); // This will print 1, not 3
        System.out.println("First element of the mutant list: " + Arrays.toString(c.get(0))); // This will print [4, 5, 6]
    }
}