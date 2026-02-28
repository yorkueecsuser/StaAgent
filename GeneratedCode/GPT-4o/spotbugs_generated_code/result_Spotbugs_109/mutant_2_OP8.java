class UselessIncrementExample {

    public int buggyMethodIncrement(int a) {
        return a++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int b) {
        return b--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int c = buggyMethodIncrement(5);
        int d = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + c);
        System.out.println("Result of buggyMethodDecrement: " + d);
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}