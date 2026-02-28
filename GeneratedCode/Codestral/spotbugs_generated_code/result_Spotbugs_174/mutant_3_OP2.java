class BuggyClass {
    private static int[] numbers = {1, 2, 3, 4, 5};

    public static int[] getNumbers() {
        return numbers; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
        int[] duplicateNumbers = numbers; // MUTANT: Duplicated the assignment statement
    }

    // Rest of the code...
}