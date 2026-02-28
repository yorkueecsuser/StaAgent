class UselessIncrementExample {

    private boolean unreachableCondition() {
        return false;
    }

    public int buggyMethodIncrement(int x) {
        boolean conditionWhile = unreachableCondition();
        while (conditionWhile) {
            // Unreachable loop
            System.out.println("This is unreachable code block in buggyMethodIncrement");
        }
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        boolean conditionWhile = unreachableCondition();
        while (conditionWhile) {
            // Unreachable loop
            System.out.println("This is unreachable code block in buggyMethodDecrement");
        }
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
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