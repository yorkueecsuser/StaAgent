class NullPointerDereference {
    private String message;

    public void showBug() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }
        System.out.println(message.length()); // Original code
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}