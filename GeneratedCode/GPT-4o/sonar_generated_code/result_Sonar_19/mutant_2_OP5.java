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

        // Unreachable switch statement mutation
        int switchCondition = getSwitchCondition(); // dynamically determined at runtime
        switch (switchCondition) {
            case 1:
                System.out.println("This is a case that will never be executed.");
                break;
            default:
                // No action needed, keeping this default case
                break;
        }
    }

    // Method to provide a switch condition that always ensures the switch is unreachable
    private static int getSwitchCondition() {
        return 0; // Always returns 0, so the case 1 will never be executed
    }
}