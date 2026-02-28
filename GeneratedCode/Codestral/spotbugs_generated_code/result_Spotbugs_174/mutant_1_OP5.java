// Buggy Java code with an added unreachable switch statement

class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100; // Modifying the returned array

        // Added unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This line should never be executed");
                    break;
            }
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