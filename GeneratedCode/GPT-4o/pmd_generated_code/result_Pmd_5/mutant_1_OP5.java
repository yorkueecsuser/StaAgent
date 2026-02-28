class BranchingBugExample {

    private int getUnreachableValue() {
        return -1;  // Returning a value that will not match any case in the switch statement.
    }

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i <= 25) {
                continue;
            }
            break; // BUG: AvoidBranchingStatementAsLastInLoop

            // Inserting unreachable switch statement.
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1: 
                    sum += 10;
                    break;
                case 2: 
                    sum += 20;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        BranchingBugExample example = new BranchingBugExample();
        System.out.println("Result: " + example.showBug());
    }
}