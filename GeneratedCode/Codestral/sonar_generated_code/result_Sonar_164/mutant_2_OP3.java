class FloatingPointEqualityBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(float myNumber) {
        if (myNumber == 3.146f) {
            return true;
        }
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This block should never be executed.");
        }
        return false;
    }
}