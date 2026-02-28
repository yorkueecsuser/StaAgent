class FloatingPointEqualityBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(float myNumber) {
        if (myNumber == 3.146f) {
            return true;
        }
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code will never be executed.");
        }
        return false;
    }
}