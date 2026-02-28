class BranchingBugExample {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
        }

        // Inserted unreachable for loop
        boolean conditionFor = getUnreachableCondition();
        for (int j = 0; conditionFor; j++) {
            // This block is unreachable
            sum += j;
        }

        return sum;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
    
    // Method to provide a runtime condition
    private boolean getUnreachableCondition() {
        // The condition is always false, making the loop unreachable
        return false;
    }
}