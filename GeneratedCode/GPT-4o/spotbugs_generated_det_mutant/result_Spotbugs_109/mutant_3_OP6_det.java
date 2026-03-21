class UselessIncrementExample {

    public int buggyMethodIncrement(int x) {
for  (int milxnqvc = 0; milxnqvc < 0; milxnqvc++) {double becdtgxo = -220642128;}

        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    
}

    public int buggyMethodDecrement(int x) {
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