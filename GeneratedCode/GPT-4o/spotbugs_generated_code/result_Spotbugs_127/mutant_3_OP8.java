class OverwrittenIncrementExample {

    public int showBug(int i) {
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public int showBug1(int i) {
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        return i;
    }

    public static void main(String[] args) {
        OverwrittenIncrementExample a = new OverwrittenIncrementExample(); // Renamed 'example' to 'a'
        
        int b = a.showBug(5); // Renamed 'result1' to 'b'
        System.out.println("Result of showBug: " + b); // Updated to use 'b'

        int c = a.showBug1(5); // Renamed 'result2' to 'c'
        System.out.println("Result of showBug1: " + c); // Updated to use 'c'
    }
}