class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        
        // Mutation: Inserting an unreachable switch statement
        boolean condition = getCondition(); // Ensures dynamic evaluation
        if (condition) {
            int value = getValue(); // This value ensures switch is unreachable
            switch (value) {
                case 1:
                    System.out.println("This case will never be executed.");
                    break;
                default:
                    System.out.println("Default case will never be executed.");
            }
        }
        
        return k;
    }

    // Helper methods to ensure dynamic condition evaluation
    private boolean getCondition() {
        return false;  // Ensures the switch statement is unreachable
    }

    private int getValue() {
        return 0;  // Value chosen such that no case matches
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}