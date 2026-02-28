import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
    }

    // Mutation Operator: Unreachable for loop
    // Description: Inserting unreachable for loop into a randomly selected basic block in the program.
    // The condition of the inserted loop is always false to make it unreachable.
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Unreachable for loop mutation
        for (int j = 0; false; j++) {
            // This loop will never be executed
            System.out.println("This line will never be reached");
        }

        System.out.println(Arrays.toString(arr2));
    }
}