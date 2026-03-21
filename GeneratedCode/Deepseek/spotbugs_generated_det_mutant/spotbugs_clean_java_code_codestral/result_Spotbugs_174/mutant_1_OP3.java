class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};
    private static boolean unreachableCondition = false;

    public static int[] getNumbers() {
        // Unreachable if statement
        if (unreachableCondition) {
            System.out.println("This line should never be executed");
        }
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100; // Modifying the returned array
        printNumbers();
    }

    public static void printNumbers() {
        for(int num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}