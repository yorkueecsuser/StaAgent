class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // condition is always false
        while (conditionWhile) {
            System.out.println("This is unreachable code inside buggyMethodIncrement.");
        }
        
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // condition is always false
        while (conditionWhile) {
            System.out.println("This is unreachable code inside buggyMethodDecrement.");
        }
        
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public boolean getCondition() {
        return false; // This will make the while loop condition always false
    }

    public void showBug() {
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // condition is always false
        while (conditionWhile) {
            System.out.println("This is unreachable code inside showBug.");
        }
        
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