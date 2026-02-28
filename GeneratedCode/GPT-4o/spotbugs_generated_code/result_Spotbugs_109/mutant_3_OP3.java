class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        if (isConditionFalse()) { // Unreachable if statement
            System.out.println("This will not be printed");
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        if (isConditionFalse()) { // Unreachable if statement
            System.out.println("This will not be printed");
        }
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
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

    // Helper method to ensure the condition is always false but not a compile-time constant
    private boolean isConditionFalse() {
        return false;
    }
}