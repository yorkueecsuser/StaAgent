class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array
    private static int[] duplicateArray; // New field to store the duplicate array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        duplicateArray = externalArray; // Mutant: Duplicating the assignment statement
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
        System.out.println("Duplicate Array first element: " + duplicateArray[0]); // This will also print 100
    }
}