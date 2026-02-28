class OverwrittenIncrementExample {

    public int showBug(int j) {
        j = j++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return j;
    }

    public int showBug1(int k) {
        k = k--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return k;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample x = new OverwrittenIncrementExample();
        
        int result1 = x.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = x.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}