class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // Introducing an unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int temp = value;   // This line will never be executed
        } else {
            // Original buggy code
            return value << shiftAmount;
        }
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}