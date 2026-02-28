class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        // Unreachable if-else statement added for mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("But this part will never execute.");
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        // Unreachable if-else statement added for mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is another unreachable code.");
        } else {
            System.out.println("This will not run either.");
        }
        return false;
    }
    
    // Helper method to simulate a condition that is always false
    private boolean getCondition() {
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
}