class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);

        // Adding unreachable if-else branch
        boolean runtimeCondition = getFalseCondition();
        if (runtimeCondition) {
            System.out.println("This branch is unreachable and should not execute.");
        } else {
            // Original code continues to execute as intended
            System.out.println("Continuing with the main method execution.");
        }
    }

    // Method to simulate false condition at runtime
    public static boolean getFalseCondition() {
        return false;
    }
}