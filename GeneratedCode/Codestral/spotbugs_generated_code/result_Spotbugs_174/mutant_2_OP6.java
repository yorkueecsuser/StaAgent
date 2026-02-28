class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100; // Modifying the returned array
        printNumbers();

        // Mutant: Insert unreachable for loop
        boolean unreachableCondition = getFalseCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never be executed as the condition is always false
            System.out.println("Unreachable code");
        }
    }

    private static boolean getFalseCondition() {
        return false;
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