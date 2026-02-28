class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean condition = getCondition();
        while (condition) { // Mutant: Unreachable while loop
            // This loop is unreachable as the condition is always false
            // Replace "getCondition()" with a method that returns false
        }

        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }

    private boolean getCondition() {
        return false;
    }
}