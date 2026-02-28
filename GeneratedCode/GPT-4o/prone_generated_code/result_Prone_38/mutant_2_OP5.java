class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }

        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Ensures the switch is not compile-time constant
        switch (unreachableValue) {
            case 99: 
                result = "Unreachable code";
                break;
            default:
                // The default case does not change the result to maintain original logic
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        // This method simulates a value that makes the switch statement unreachable
        return 0;  // Ensures none of the switch cases are executed
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}