class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        return result;
    }

    // Mutant code: Renaming a user-defined variable
    public String showBugMutant(boolean condition) {
        String r; // Renamed 'result' to 'r'
        if (condition) {
            r = "This branch is executed.";
        } else {
            r = "This branch is executed."; // BUG: DuplicateBranches
        }
        return r;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));

        // Testing the mutant method
        System.out.println(example.showBugMutant(true));
        System.out.println(example.showBugMutant(false));
    }
}