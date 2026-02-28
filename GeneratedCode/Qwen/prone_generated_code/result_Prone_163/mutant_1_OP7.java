class ThrowNullExample {

    // Method to demonstrate the ThrowNull bug
    public void showBug() {
        try {
            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop is unreachable because getCondition() will always return false
                System.out.println("This loop is unreachable");
            }
            
            throw null; // BUG: ThrowNull
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
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