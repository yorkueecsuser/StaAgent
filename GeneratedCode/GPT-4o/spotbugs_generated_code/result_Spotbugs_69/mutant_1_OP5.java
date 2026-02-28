class RedundantNullCheckExample {

    public String showBug(String input) {
        // Dereferencing input
        int length = input.length();
        
        // Redundant null check after dereference
        if (input != null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            // Adding unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                default:
                    System.out.println("Default case, also never reached.");
            }

            return "Input string length is: " + length;
        } else {
            return "Input was null";
        }
    }

    private int getUnreachableValue() {
        // This method ensures the value will never trigger the switch cases
        return 2; // Ensure this value doesn't match any case in the switch
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
    }
}