class StaticArrayBug {
    private static int[] buggyArray;

    public static void setBuggyArray(int[] externalArray) {
        buggyArray = externalArray;
        // Inserting unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
    }

    public static void showBug(int[] externalArray) {
        setBuggyArray(externalArray);
        externalArray[0] = 100;
        System.out.println("Buggy Array first element: " + buggyArray[0]);
    }
}