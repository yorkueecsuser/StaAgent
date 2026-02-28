// Buggy Java code for demonstrating the bug MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
// Mutant code: Renamed the variable'returnedNumbers' to'modifiedNumbers'

class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    public static void showBug() {
        int[] modifiedNumbers = getNumbers(); // Mutant code: Renamed variable'returnedNumbers' to'modifiedNumbers'
        modifiedNumbers[0] = 100; // Modifying the returned array
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