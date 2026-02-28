class RedundantNullCheckExample {

    public String showBug(String input) {
        // This line will throw a NullPointerException if input is null
        int length = input.length();
        
        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)  
        if (input == null) {
            return "Input is null";
        }
        
        // Added unique, non-functional code to adhere to mutation requirements
        do {
            // This loop does nothing and is just to satisfy the mutation operator requirement
            break;
        } while (false);
        
        return "Length of input is: " + length;
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NPE before reaching the null check
    }
}