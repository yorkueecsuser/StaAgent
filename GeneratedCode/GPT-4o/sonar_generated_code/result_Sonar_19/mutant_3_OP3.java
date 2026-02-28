class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Accessing the array element without checking if the index is within bounds
        boolean condition = getCondition(); // Dynamic condition to avoid compile-time constant
        if (condition) {
            System.out.println("This code is unreachable due to the condition being always false.");
        }
        
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
    }
}