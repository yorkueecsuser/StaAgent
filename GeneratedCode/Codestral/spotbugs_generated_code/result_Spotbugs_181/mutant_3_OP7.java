class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    public static boolean getCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);

        // Insert an unreachable while loop here
        while (getCondition()) { /* This loop is unreachable */ }

        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will still print 100
    }
}