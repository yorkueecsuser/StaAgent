class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        int result = value;
        // The loop is an equivalent mutation of the original shift operation.
        for (int i = 0; i < shiftAmount; i++) {
            result = result << 1;
        }
        return result;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}