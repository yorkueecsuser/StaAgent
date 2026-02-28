class RedundantNullCheckExample {

    public String showBug(String input) {
        // This line will throw a NullPointerException if input is null
        int length = input.length();
        
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case");
                break;
        }
        
        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)  
        if (input == null) {
            return "Input is null";
        }
        
        return "Length of input is: " + length;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NPE before reaching the null check
    }
}