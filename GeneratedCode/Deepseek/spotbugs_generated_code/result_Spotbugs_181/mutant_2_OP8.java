// This code exemplifies the bug "MS: May expose internal static state by creating a buffer which stores an external array into a static field (EI_EXPOSE_STATIC_BUF2)"

class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setExternalArray(int[] externalArr) {
        buggyArray = externalArr; // Bug: Storing external array into the static field
    }

    public static void showBug(int[] inputArr) {
        setExternalArray(inputArr);
        // Modifying the input array will affect the static field
        inputArr[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }
}