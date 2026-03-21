// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);

        // Added mutant code: Unreachable switch statement
        int value = getValue(); // Assume this method returns a value other than 1
        switch(value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }

    // Assume this method returns a value other than 1
    private static int getValue() {
        return 2;
    }
}