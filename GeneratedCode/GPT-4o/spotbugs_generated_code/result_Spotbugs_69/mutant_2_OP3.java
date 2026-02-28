class RedundantNullCheckExample {

    public String showBug(String input) {
        // Dereferencing input
        int length = input.length();
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            boolean condition = getFalseCondition(); // Using a method call to ensure it's not a compile-time constant
            if (condition) {
                // Unreachable block
                return "Unreachable code block!";
            }
            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }
}