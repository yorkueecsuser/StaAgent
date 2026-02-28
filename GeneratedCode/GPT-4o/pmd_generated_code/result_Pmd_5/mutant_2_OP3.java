class BranchingBugExample {

    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop
            
            // Introducing unreachable if statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                sum += i; // This block is unreachable
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}