class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        // Unreachable for loop added
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        // Unreachable for loop added
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop.");
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

    // Helper method to ensure the condition is dynamically determined and prevents unreachable code error
    private boolean getCondition() {
        return false;
    }
}