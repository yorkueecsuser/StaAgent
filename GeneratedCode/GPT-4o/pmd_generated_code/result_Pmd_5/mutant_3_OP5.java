class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable.");
                break;
            default:
                // Default case can be empty, it's already unreachable
                break;
        }

        return sum;
    }

    // This method returns a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 0; // Change this to any value not used in the switch cases
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}