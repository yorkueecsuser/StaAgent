// Buggy Java code for demonstrating the bug MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)

class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100; // Modifying the returned array

        // Mutation: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
        }

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