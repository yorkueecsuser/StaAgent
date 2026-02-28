class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }

        // Unreachable for loop insertion
        boolean conditionForLoop = getUnreachableCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This for loop is unreachable.");
        }

        return result;
    }

    // Method to simulate a dynamically determined condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}