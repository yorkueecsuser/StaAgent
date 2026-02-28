class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            
            // Inserting unreachable if-else branch
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This will never be printed because shouldRun is always false.");
            } else {
                System.out.println("This will also never be printed because shouldRun is always false.");
            }
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullExample example = new ThrowNullExample();
        example.showBug();
    }
}