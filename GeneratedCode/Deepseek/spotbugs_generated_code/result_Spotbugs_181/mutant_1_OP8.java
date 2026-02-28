class StaticArrayBug {
    private static int[] buggyArray;

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray;
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]);
    }

    // Mutant code
    public static void modifyArray(int[] arrayRenamed) {
        arrayRenamed[1] = 200;
    }
}