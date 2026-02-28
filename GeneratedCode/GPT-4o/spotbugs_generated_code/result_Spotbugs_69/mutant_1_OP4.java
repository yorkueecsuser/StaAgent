class RedundantNullCheckExample {

    public String showBug(String input) {
        // Dereferencing input
        int length = input.length();
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    // Method to generate a condition for unreachable code
    private boolean getCondition() {
        return 1 > 2; // Always false condition
    }
    
    public void unreachableCodeExample() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is always reached");
        }
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
        example.unreachableCodeExample();
    }
}