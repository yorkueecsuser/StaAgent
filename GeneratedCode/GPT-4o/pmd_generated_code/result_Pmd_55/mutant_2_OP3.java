class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // Unreachable if statement added
        boolean unreachableCondition = generateFalseCondition();
        if (unreachableCondition) {
            System.out.println("This line is unreachable");
        }
        
        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // Unreachable if statement added
        boolean unreachableCondition = generateFalseCondition();
        if (unreachableCondition) {
            System.out.println("This line is unreachable");
        }
        
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    private boolean generateFalseCondition() {
        // This method always returns false, making the condition unreachable
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