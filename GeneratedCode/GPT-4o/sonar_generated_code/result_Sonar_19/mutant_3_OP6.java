class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Unreachable for loop added for mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable");
        }

        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }

    // Helper method to ensure the condition is not a compile-time constant
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