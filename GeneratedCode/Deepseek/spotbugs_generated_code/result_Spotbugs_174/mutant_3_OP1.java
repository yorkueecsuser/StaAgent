// Mutated Java code for demonstrating the bug MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP) and the Dead Store mutation operator

class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        // Dead Store mutation operator added here
        int deadStoreVariable = 10;
        return numbers; // Bug is still present here
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