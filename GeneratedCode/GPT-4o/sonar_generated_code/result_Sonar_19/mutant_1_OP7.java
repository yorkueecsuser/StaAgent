class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Inserting an unreachable while loop
        boolean unreachableCondition = isUnreachableCondition();
        while (unreachableCondition) {
            // This code block is unreachable
            System.out.println("This is unreachable code");
        }
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    private boolean isUnreachableCondition() {
        return false; // This method returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
    }
}