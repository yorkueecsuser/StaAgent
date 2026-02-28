class DuplicateBranchesExample {

    public String showBug(boolean condition) {
        String result;
        if (condition) {
            result = "This branch is executed.";
        } else {
            result = "This branch is executed."; // BUG: DuplicateBranches
        }

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 0:
                // This branch is unreachable
                result = "Unreachable branch executed.";
                break;
            default:
                // Default case is also unreachable
                result = "Default unreachable branch.";
                break;
        }

        return result;
    }

    // Method to ensure the switch condition is not a constant
    private int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) {
        DuplicateBranchesExample example = new DuplicateBranchesExample();
        System.out.println(example.showBug(true));
        System.out.println(example.showBug(false));
    }
}