class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        // Mutant: Unreachable if statement added
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        }
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }

    // Method to simulate the condition for the unreachable if statement
    private static boolean getCondition() {
        return false;
    }
}