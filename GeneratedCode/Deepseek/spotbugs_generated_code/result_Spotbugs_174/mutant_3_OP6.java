class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        // Inserting an unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            System.out.println("This is an unreachable loop");
        }
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    private static boolean getFalseCondition() {
        return false; // Always returns false, making the loop unreachable
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