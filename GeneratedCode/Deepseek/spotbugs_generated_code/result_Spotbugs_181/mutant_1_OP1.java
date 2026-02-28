// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)" along with a dead store

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array
    private static int deadStoreVariable; // Dead store variable declaration

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        deadStoreVariable = 10; // Assigning a value to the dead store variable
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
        // The dead store variable is not used anywhere in the code
    }
}