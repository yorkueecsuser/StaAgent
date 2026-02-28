class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        
        // Unreachable if-else statement mutation
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            result = "Unreachable branch";
        } else {
            // No operation, just to satisfy the syntax
        }

        return result;
    }

    private boolean getFalseCondition() {
        return false; // This method makes the if condition appear dynamic
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}