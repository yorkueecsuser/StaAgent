class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array
    private static int[] duplicatedBuggyArray; // New field to store the duplicated array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field
        duplicatedBuggyArray = externalArray; // Duplicated assignment statement
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect both the static fields
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
        System.out.println("Duplicated Buggy Array first element: " + duplicatedBuggyArray[0]); // This will also print 100
    }
}