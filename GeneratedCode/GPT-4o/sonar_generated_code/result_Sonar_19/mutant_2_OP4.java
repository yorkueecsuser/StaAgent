class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // dynamically determined condition
        if (condition) {
            // This block will never be executed
            System.out.println("Unreachable code block");
        } else {
            // Accessing the array element without checking if the index is within bounds
            return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        }
        return -1; // Default return in case of unreachable code logic
    }
    
    // Method to simulate a condition that is always false for demonstration
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
    }
}