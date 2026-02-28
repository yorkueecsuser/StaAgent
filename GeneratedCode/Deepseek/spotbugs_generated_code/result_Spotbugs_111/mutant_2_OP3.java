class DeadParameterBug {
    public int showBug(int input) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("Unreachable block");
        }
        input = 10; // Original bug remains unchanged
        return input;
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to ensure the block is unreachable
    }
}