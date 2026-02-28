class FinalizeBugExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    }

    public void showBug(int param) {
        int result = finalize(param);
        System.out.println("Result from buggy finalize method: " + result);

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42);
    }
}