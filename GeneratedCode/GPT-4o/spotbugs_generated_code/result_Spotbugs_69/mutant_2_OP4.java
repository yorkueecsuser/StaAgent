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
    
    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        
        // Implementing unreachable if-else statement using a dynamically determined condition
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the expected branch.");
        }

        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }

    // Method to simulate a condition that is always false
    private static boolean getUnreachableCondition() {
        return false;
    }
}