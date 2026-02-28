class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }

        // Adding unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determine the condition
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    // Method returning false to simulate unreachable condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}