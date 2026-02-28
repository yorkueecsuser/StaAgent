class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // Adding an unreachable if branch using a dynamically determined condition
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block in showBug.");
        }

        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // Adding an unreachable if branch using a dynamically determined condition
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This is an unreachable block in showBug2.");
        }

        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    private boolean getFalseCondition() {
        // Dynamically returning false to create an unreachable branch
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