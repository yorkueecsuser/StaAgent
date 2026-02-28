class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        // Unreachable for loop
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        // Unreachable for loop
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int resultIncrement = buggyMethodIncrement(5);
        int resultDecrement = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
        System.out.println("Result of buggyMethodDecrement: " + resultDecrement);
    }

    private boolean getCondition() {
        return false; // The condition is false to make the for loop unreachable
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}