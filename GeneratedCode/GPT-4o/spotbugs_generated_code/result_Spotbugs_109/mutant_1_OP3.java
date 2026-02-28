class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    // Method to prevent compile-time optimization of the condition
    private boolean getCondition() {
        return false;
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