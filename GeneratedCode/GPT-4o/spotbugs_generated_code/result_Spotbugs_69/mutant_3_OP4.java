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

    private boolean getUnreachableCondition() {
        // This method is used to simulate a runtime condition that is always false
        return false;
    }

    public void unreachableCodeExample() {
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the else branch of an unreachable condition.");
        }
    }

    public static void main(String[] args) {
        RedundantNullCheckExample example = new RedundantNullCheckExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
        System.out.println(example.showBug("Hello"));
        example.unreachableCodeExample();
    }
}