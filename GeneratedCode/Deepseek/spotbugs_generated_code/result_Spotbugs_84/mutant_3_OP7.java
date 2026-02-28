class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int val) {
        // Original bug
        boolean result = ((val & CONSTANT) > 0);

        // Insert unreachable while loop
        boolean conditionWhile = getCondition();
        while(conditionWhile) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }
}