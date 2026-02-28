class DeadLocalIncrementInReturn {

    public int showBug1(int x) {
        return x++; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    public int showBug2(int x) {
        return x--; // BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    // Mutant code added
    public int mutantShowBug1(int x) {
        do {
            return x++;
        } while (false); // Ensuring the loop runs only once and maintains the original bug
    }

    public int mutantShowBug2(int x) {
        do {
            return x--;
        } while (false); // Ensuring the loop runs only once and maintains the original bug
    }

    public static void main(String[] args) {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        System.out.println("showBug1 result: " + example.showBug1(5)); // Expected output: 5
        System.out.println("showBug2 result: " + example.showBug2(5)); // Expected output: 5
        System.out.println("mutantShowBug1 result: " + example.mutantShowBug1(5)); // Expected output: 5
        System.out.println("mutantShowBug2 result: " + example.mutantShowBug2(5)); // Expected output: 5
    }
}