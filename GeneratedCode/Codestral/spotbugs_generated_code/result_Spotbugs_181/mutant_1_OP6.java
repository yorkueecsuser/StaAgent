class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        // Mutant: Inserting unreachable for loop
        for (int i = 0; checkCondition(); i++) {
            // Unreachable code block
        }

        buggyArray = externalArray; // Bug: Storing external array into the static field
    }

    // Method to dynamically check the condition
    private static boolean checkCondition() {
        return false;
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }
}