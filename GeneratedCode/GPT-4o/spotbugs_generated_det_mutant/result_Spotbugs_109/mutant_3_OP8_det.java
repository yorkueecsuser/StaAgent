class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int lpofqnlp = buggyMethodIncrement(5);
        int xwugdusn = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + lpofqnlp);
        System.out.println("Result of buggyMethodDecrement: " + xwugdusn);
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}