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

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never print.");
                break;
            default:
                System.out.println("This is the default case.");
        }

        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }

    private static int getUnreachableValue() {
        return -1; // This value is not equal to any case labels, ensuring the switch statement is unreachable
    }
}