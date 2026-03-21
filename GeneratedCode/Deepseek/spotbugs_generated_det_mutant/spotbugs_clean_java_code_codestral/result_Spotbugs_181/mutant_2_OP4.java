class StaticArrayBug {
    private static int[] buggyArray; // Bug: Static field storing external array

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray; // Bug: Storing external array into the static field

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch should never be reached");
        } else {
            int[] newArray = new int[externalArray.length];
            System.arraycopy(externalArray, 0, newArray, 0, externalArray.length);
            buggyArray = newArray;
        }
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        // Modifying the external array will affect the static field
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]); // This will print 100
    }

    private static boolean getCondition() {
        return false; // This condition makes the if-else branch unreachable
    }
}