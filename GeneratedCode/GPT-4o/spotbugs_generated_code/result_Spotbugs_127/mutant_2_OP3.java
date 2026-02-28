class OverwrittenIncrementExample {

    public int showBug(int i) {
        boolean condition = getFalseCondition();
        if (condition) {
            i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        }
        return i;
    }

    public int showBug1(int i) {
        boolean condition = getFalseCondition();
        if (condition) {
            i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        }
        return i;
    }

    // Method to obtain a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        
        int result1 = example.showBug(5);
        System.out.println("Result of showBug: " + result1); // Expected output: 5

        int result2 = example.showBug1(5);
        System.out.println("Result of showBug1: " + result2); // Expected output: 5
    }
}