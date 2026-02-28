class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    // Renamed the "example" variable to "a"
    public static void main(String[] args) {
        OverwrittenIncrementExample a = new OverwrittenIncrementExample();
        
        int result1 = a.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = a.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}