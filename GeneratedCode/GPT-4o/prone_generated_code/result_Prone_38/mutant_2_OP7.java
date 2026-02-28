class DuplicateBranchesExample {
    
    // This method simulates a condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        
        // Insert an unreachable while loop
        boolean unreachableCondition = getFalseCondition();
        while (unreachableCondition) {
            // This block is unreachable due to the condition
            System.out.println("This will never be printed.");
        }

        return result;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}