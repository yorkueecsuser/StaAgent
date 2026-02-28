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

        // Inserting unreachable while loop into the main method
        boolean conditionWhile = determineCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }

    // Method to provide a dynamic condition for the while loop
    public static boolean determineCondition() {
        return false;
    }
}