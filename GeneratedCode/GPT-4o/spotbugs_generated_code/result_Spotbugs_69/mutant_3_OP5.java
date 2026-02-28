class RedundantNullCheckExample {

    public String showBug(String input) {
        // Dereferencing input
        int length = input.length();
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            // Unreachable switch statement
            int switchCondition = getSwitchCondition(); // non-final variable
            switch(switchCondition) {
                case 999: // This case will never be reached because getSwitchCondition() returns 0
                    return "This is an unreachable code block";
            }
            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }

    // Helper method to ensure dynamic determination at runtime
    private int getSwitchCondition() {
        return 0; // Always returns 0, making the switch case unreachable
    }
}