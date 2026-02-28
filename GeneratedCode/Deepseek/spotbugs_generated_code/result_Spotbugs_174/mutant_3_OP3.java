class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        if (isUnreachableBranch()) { // Unreachable if statement
            System.out.println("This branch is unreachable.");
        }
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100; // Modifying the returned array
        printNumbers();
    }

    public static void printNumbers() {
        for(int num : numbers) {
            System.out.println(num);
        }
    }

    public static boolean isUnreachableBranch() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        showBug();
    }
}