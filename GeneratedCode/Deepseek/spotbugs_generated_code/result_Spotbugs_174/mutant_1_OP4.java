class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers;
    }

    public static void showBug() {
        int[] returnedNumbers = getNumbers();
        returnedNumbers[0] = 100;

        // Mutation: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code should never be executed.");
        } else {
            // This else block is unreachable, as the condition is always false
            System.out.println("Unreachable code.");
        }

        printNumbers();
    }

    public static void printNumbers() {
        for(int num : numbers) {
            System.out.println(num);
        }
    }

    // Method to return a false condition for the mutation
    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}