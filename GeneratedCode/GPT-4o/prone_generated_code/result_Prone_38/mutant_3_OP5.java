class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }
        
        // Inserting unreachable switch statement
        int unreachableValue = getCurrentValue(); // This method should always return a value not in the switch cases
        switch (unreachableValue) {
            case 999:
                System.out.println("Unreachable code: This will never execute.");
                break;
            default:
                // No action needed
                break;
        }

        return result;
    }

    // Helper method to ensure the switch statement is unreachable
    private int getCurrentValue() {
        // Return a value that is not in the switch cases
        return 1234;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}