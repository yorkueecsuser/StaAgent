class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        
        // Introducing an unreachable while loop as per the mutation operator
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This line will never be executed.");
        }
        
        return result;
    }

    // Helper method to ensure the while loop condition is dynamically determined
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}