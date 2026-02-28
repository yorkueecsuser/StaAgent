class DeadLocalIncrementInReturn {

    public int showBug1(int x) {
        // Equivalent Loop Replacement: No loops present, so no replacement is done.
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int showBug2(int x) {
        // Equivalent Loop Replacement: No loops present, so no replacement is done.
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public static void main(String[] args) {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        System.out.println("showBug1 result: " + example.showBug1(5)); // Expected output: 5
        System.out.println("showBug2 result: " + example.showBug2(5)); // Expected output: 5

        // Adding an equivalent loop replacement mutant
        int i = 0;
        do {
            i++;
        } while (i < 1); // Equivalent to while (i < 1) { i++; }

        int j = 0;
        do {
            j--;
        } while (j > -1); // Equivalent to while (j > -1) { j--; }
    }
}