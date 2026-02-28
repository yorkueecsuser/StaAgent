class ComparisonOutOfRangeBug {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(byte value) {
        // BUG: ComparisonOutOfRange
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable");
        }
        return value == 200; // This will always return false because 200 is out of the range for a byte (-128 to 127)
    }
}