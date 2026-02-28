class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }

        // Mutant: Adding an unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            result = "This branch will never execute.";
        }

        return result;
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}