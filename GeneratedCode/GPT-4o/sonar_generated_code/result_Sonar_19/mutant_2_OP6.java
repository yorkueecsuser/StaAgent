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

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code inside the loop");
        }
    }

    public static boolean getCondition() {
        return false; // This ensures that the for loop is unreachable
    }
}