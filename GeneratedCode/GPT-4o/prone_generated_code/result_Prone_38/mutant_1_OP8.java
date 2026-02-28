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

    // Mutant method with renamed variable
    public String showBugMutant(boolean condition) {
        String x; // Renamed from 'result' to 'x'
        if (condition) {
            x = "This branch is executed.";
        } else {
            x = "This branch is executed."; 
        }
        return x;
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