class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // Condition is intentionally false for mutation
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This part of the code is reachable during runtime.");
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // Condition is intentionally false for mutation
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This part of the code is reachable during runtime.");
        }
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    // Method to simulate dynamic condition for unreachable code
    private boolean getCondition() {
        return false; // Always returns false to ensure the if-block is unreachable
    }

    public void showBug() {
        int resultIncrement = buggyMethodIncrement(5);
        int resultDecrement = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
        System.out.println("Result of buggyMethodDecrement: " + resultDecrement);
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}