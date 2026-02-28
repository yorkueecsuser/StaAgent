class RedundantNullCheckExample {

    public String showBug(String input) {
        // This line will throw a NullPointerException if input is null
        int length = input.length();
        
        // Introducing an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
        
        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)  
        if (input == null) {
            return "Input is null";
        }
        
        return "Length of input is: " + length;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NPE before reaching the null check
    }
}