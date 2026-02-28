class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // Non-final variable to avoid compile-time constant
        while (conditionWhile) {
            // This will never execute
            System.out.println("This is an unreachable code block.");
        }

        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // Inserting an unreachable while loop
        boolean conditionWhile2 = getCondition(); // Non-final variable to avoid compile-time constant
        while (conditionWhile2) {
            // This will never execute
            System.out.println("This is an unreachable code block in showBug2.");
        }
        
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }
    
    private boolean getCondition() {
        return false; // Always returns false, ensuring the loop is unreachable
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        
        // Demonstrating the bug; this will throw NullPointerException
        try {
            System.out.println("Result 1: " + example.showBug(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBug!");
        }
        
        // Demonstrating the bug; this will throw NullPointerException
        try {
            System.out.println("Result 2: " + example.showBug2(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBug2!");
        }
    }
}