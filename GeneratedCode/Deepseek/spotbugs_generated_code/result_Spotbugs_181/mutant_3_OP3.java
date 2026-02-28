class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;

        // Mutant code: Unreachable if statement
        if (getUnreachableCondition()) {
            // This code will never be executed
            int x = 10 / 0; // To avoid empty block error
        }

        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will still print 100
    }

    // Unreachable condition method
    private static boolean getUnreachableCondition() {
        return false; // This condition will always be false
    }
}