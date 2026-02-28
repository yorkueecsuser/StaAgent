class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop inserted
        }
        System.out.println(message.length()); // BUG: Null pointers should not be dereferenced
    }

    private boolean getCondition() {
        return false;
    }
}