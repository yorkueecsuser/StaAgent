class SelfComparisonBug {
    private int value;
    private boolean alwaysFalse = false;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
        if (alwaysFalse) {
            // Unreachable mutant code
            System.out.println("This statement will never be reached.");
        }

        return value == value; // Original bug still exists
    }
}