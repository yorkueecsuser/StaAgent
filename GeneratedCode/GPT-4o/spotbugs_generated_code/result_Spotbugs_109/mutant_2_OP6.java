class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        // Adding an unreachable for loop
        boolean conditionForIncrement = getCondition();
        for (int i = 0; conditionForIncrement; i++) {
            System.out.println("This will never print in increment method.");
        }

        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        // Adding an unreachable for loop
        boolean conditionForDecrement = getCondition();
        for (int i = 0; conditionForDecrement; i++) {
            System.out.println("This will never print in decrement method.");
        }

        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int resultIncrement = buggyMethodIncrement(5);
        int resultDecrement = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
        System.out.println("Result of buggyMethodDecrement: " + resultDecrement);
    }

    private boolean getCondition() {
        // Always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}