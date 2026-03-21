class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int jkkgkugs = buggyMethodIncrement(5);
        int vaxzyplt = buggyMethodDecrement(5);
        
        System.out.println("Result of buggyMethodIncrement: " + jkkgkugs);
        System.out.println("Result of buggyMethodDecrement: " + vaxzyplt);
    }

    public static void main(String[] args) {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug();
    }
}