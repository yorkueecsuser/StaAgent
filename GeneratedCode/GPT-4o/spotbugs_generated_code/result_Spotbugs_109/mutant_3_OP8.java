class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int buggyMethodDecrement(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public void showBug() {
        int a = buggyMethodIncrement(5); // Renamed variable resultIncrement to a
        int b = buggyMethodDecrement(5); // Renamed variable resultDecrement to b
        
        System.out.println("Result of buggyMethodIncrement: " + a);
        System.out.println("Result of buggyMethodDecrement: " + b);
    }

    public static void main(String[] args) {
        UselessIncrementExample c = new UselessIncrementExample(); // Renamed variable example to c
        c.showBug();
    }
}