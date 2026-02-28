class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Unreachable statement");
        } else {
            System.out.println(message.length()); // Original code
        }
    }

    private boolean getCondition() {
        return false;  // This method always returns false, making the branch unreachable
    }
}