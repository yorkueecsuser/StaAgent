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
    
    public String unreachableExample(String input) {
        // Introducing an unreachable if branch
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            return "This will never be returned.";
        }
        return showBug(input);
    }

    private boolean getFalseCondition() {
        // A method to ensure the condition is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));

        // Testing the unreachable example method
        System.out.println(example.unreachableExample("Test"));
    }
}