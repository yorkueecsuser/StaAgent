class NullPointerDereference {
    private String message;

    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop.");
        }
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }
}