class RedundantNullCheckExample {

    public String showBug(String input) {
        // Example of unreachable for loop mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable since conditionFor is always false
            System.out.println("This will never print");
        }

        // Dereferencing input
        int length = input.length();
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }
}