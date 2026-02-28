class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        boolean unreachableCondition = calculateCondition(); // Using a method call to ensure runtime evaluation.
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        } else {
            int resultIncrement = buggyMethodIncrement(5);
            int resultDecrement = buggyMethodDecrement(5);

            System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
            System.out.println("Result of buggyMethodDecrement: " + resultDecrement);
        }
    }

    private boolean calculateCondition() {
        return false; // The condition is always false, making the if branch unreachable.
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}