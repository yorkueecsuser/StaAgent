class DeadLocalIncrementInReturn {

    public int showBug1(int x) {
        // Added mutant: Equivalent Loop Replacement (dummy loop)
        int i = 0;
        do {
            i++;
        } while (i < 1);

        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int showBug2(int x) {
        // Added mutant: Equivalent Loop Replacement (dummy loop)
        int j = 0;
        do {
            j++;
        } while (j < 1);

        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public static void main(String[] args) {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        System.out.println("showBug1 result: " + example.showBug1(5)); // Expected output: 5
        System.out.println("showBug2 result: " + example.showBug2(5)); // Expected output: 5
    }
}