class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intentionally left empty to ensure it does not affect the original logic
        } else {
            // This else block is also intentionally left empty
        }
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }

    private boolean getCondition() {
        // This method returns a constant false, but it is not a compile-time constant
        return 1 == 2;
    }
}