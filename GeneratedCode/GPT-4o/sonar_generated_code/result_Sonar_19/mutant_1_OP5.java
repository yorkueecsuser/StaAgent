class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
        // Accessing the array element without checking if the index is within bounds
        return array[index]; // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException

        // Begin Unreachable Switch Statement
        int unreachableValue = getUnreachableSwitchValue(); // Method call to ensure runtime value
        switch (unreachableValue) {
            case 999: // This case will never be true based on getUnreachableSwitchValue logic
                System.out.println("This code is unreachable.");
                break;
        }
        // End Unreachable Switch Statement
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};
        int result = example.showBug(sampleArray, 5); // This will cause an ArrayIndexOutOfBoundsException
        System.out.println("Accessed element: " + result);
    }

    private int getUnreachableSwitchValue() {
        // This method always returns a value that does not match any case in the switch statement
        return 0;
    }
}