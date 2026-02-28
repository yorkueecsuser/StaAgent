// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"
// And has an added unreachable while loop mutant

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        // Mutant: Inserting an unreachable while loop
        boolean conditionWhile = false; // Ensure the loop condition is always false to make it unreachable
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop mutant!");
        }
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }

    // Method to simulate dynamic determination of condition for the while loop
    private static boolean getCondition() {
        // Dynamic condition determination code goes here
        return false;
    }
}