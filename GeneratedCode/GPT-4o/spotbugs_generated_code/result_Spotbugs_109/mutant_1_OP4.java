class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        }
    }

    public int buggyMethodDecrement(int x) {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        }
    }

    public void showBug() {
        int resultIncrement = buggyMethodIncrement(5);
        int resultDecrement = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
        System.out.println("Result of buggyMethodDecrement: " + resultDecrement);
    }

    private boolean getFalseCondition() {
        return false; // Method returns false to ensure the if-else is unreachable
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}