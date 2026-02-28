class IncrementOverwriteBug {

    // Method to demonstrate the bug
    public int showBug(int initialValue) {
        int i = initialValue;
        int a = initialValue; // Added variable for renaming mutation
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    // Another method to demonstrate the bug with decrement
    public int showBug2(int initialValue) {
        int i = initialValue;
        int b = initialValue; // Added variable for renaming mutation
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public static void main(String[] args) {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        int c = 5; // Added variable for renaming mutation
        System.out.println("Result of showBug(5): " + bugDemo.showBug(c)); // Expected output: 5
        System.out.println("Result of showBug2(5): " + bugDemo.showBug2(c)); // Expected output: 5
    }
}