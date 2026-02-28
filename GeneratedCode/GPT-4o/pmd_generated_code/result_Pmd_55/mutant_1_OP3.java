class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // Adding an unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This should never print.");
        }

        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // Adding an unreachable if statement
        boolean anotherUnreachableCondition = getAnotherUnreachableCondition();
        if (anotherUnreachableCondition) {
            System.out.println("This should never print.");
        }

        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
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

    // Methods to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false; // Always returns false to ensure the condition is unreachable
    }

    private boolean getAnotherUnreachableCondition() {
        return false; // Another always-false condition
    }
}