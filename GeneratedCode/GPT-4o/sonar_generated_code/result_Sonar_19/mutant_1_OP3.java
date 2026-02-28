class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Potential unreachable if branch mutation
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This line is never executed.");
        }
        
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
        return false; // This makes the if statement unreachable
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
    }
}