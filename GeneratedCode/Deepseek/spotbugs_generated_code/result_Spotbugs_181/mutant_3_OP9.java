// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"
// And uses the mutation operator "Equivalent Loop Replacement"

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Replacing the direct modification of the external array with a do-while loop
        int i = 0;
        do {
            externalArray[i] = 100;
            i++;
        } while (i < externalArray.length);
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will still print 100
    }
}