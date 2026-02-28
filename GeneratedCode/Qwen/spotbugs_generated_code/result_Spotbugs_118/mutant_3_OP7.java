class NullInstanceofExample {

    // Method to demonstrate the bug
    public boolean showBug() {
        Object obj = null;
        
        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable
            System.out.println("This loop is unreachable");
        }
        
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF) 
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        NullInstanceofExample example = new NullInstanceofExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}