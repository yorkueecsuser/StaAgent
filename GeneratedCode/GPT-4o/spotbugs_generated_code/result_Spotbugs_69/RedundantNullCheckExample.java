class RedundantNullCheckExample {

    public String showBug(String input) {
        // Dereferencing input
        int length = input.length();
        
        // Unreachable while loop added
        boolean conditionWhile = false; // Non-final variable used for the loop condition
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is an unreachable while loop");
        }
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
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
}