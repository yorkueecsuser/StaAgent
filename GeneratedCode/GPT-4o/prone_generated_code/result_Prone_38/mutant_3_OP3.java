class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        
        // Adding an Unreachable if branch
        boolean unreachableCondition = getFalseCondition(); // This is always false
        if (unreachableCondition) {
            result = "This code is unreachable.";
        }

        return result;
    }

    // Helper method to simulate an always false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}