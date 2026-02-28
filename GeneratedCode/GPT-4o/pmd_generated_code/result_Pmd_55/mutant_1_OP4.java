class NullCheckExample {
    
    // A method to return a condition which is always false at runtime
    private boolean getFalseCondition() {
        return 1 > 2; // This is always false.
    }

    public boolean showBug(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        // Unreachable if-else branch
        if (getFalseCondition()) {
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("Executing else block.");
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        // Unreachable if-else branch
        if (getFalseCondition()) {
            System.out.println("This is an unreachable block.");
        } else {
            System.out.println("Executing else block.");
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
}