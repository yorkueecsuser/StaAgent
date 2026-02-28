// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;

        // Unreachable if-else statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable branch executed.");
        } else {
            System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
        }
    }
}