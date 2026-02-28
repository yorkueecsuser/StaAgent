class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        
        // Introducing an unreachable if-else branch
        boolean condition = false; // This condition is deliberately set to false
        if (condition) {
            System.out.println("This code is unreachable and meant for mutation testing.");
        } else {
            // Original code remains here
            int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
            System.out.println("Accessed element: " + result);
        }
    }
}