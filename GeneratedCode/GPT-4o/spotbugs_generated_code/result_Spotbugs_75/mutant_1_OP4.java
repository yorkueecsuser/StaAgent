class EqualsNullExample {

    public boolean showBug(String input) {
        String sample = "example";
        
        // Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable because the condition is always false
            System.out.println("This will never be printed.");
        } else {
            // This is the reachable block
            System.out.println("Unreachable condition was false.");
        }
        
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    }
    
    private boolean getUnreachableCondition() {
        return false; // Non-final variable method that returns false
    }

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}