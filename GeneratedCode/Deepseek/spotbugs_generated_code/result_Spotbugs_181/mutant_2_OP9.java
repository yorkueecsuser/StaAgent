class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        // Equivalent Loop Replacement is not applicable here, so the original code remains.
        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }
}