class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // Insert unreachable while loop as per mutation operator
        while (false) {
            // This loop is unreachable as the condition is always false
        }

        // Original bug remains intact
        return value << shiftAmount;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}