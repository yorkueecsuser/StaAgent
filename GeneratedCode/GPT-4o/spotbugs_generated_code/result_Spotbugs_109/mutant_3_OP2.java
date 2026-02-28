class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        int originalX = x; // Duplicate assignment
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        int originalX = x; // Duplicate assignment
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int resultIncrement = buggyMethodIncrement(5);
        resultIncrement = buggyMethodIncrement(5); // Duplicate assignment
        int resultDecrement = buggyMethodDecrement(5);
        resultDecrement = buggyMethodDecrement(5); // Duplicate assignment
        
        System.out.println("Result of buggyMethodIncrement: " + resultIncrement);
        System.out.println("Result of buggyMethodDecrement: " + resultDecrement);
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}