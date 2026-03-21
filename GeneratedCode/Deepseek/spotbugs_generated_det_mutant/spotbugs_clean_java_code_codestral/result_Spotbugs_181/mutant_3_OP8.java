// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array
    private static int[] tempArray; // Mutated code: Additional variable for renaming

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        tempArray = new int[externalArray.length]; // Mutated code: Storing a copy of the external array
        System.arraycopy(externalArray, 0, tempArray, 0, externalArray.length);
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
        System.out.println("Temp Array first element: " + tempArray[0]); // This will not be affected by external array modifications
    }
}