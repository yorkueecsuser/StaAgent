class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        
        // Unreachable if-else branch inserted
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute
            System.out.println("This should never be printed.");
        } else {
            // Alternative branch that will also never execute
            System.out.println("This should also never be printed.");
        }

        return false;
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        // Always returns false, making the if-else branch unreachable
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}