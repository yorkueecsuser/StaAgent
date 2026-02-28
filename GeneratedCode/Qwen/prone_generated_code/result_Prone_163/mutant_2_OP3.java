class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
            
            // Unreachable if statement mutation
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This is an unreachable if statement.");
            }
        }
    }

    // Method to provide a dynamic condition that will always be false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullExample example = new ThrowNullExample();
        example.showBug();
    }
}