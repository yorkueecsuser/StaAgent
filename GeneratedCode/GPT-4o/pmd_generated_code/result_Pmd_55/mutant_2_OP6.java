class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        
        // Unreachable for loop inserted
        boolean conditionFor = isConditionFalse();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute
            System.out.println("Unreachable loop in showBug method");
        }
        
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        
        // Unreachable for loop inserted
        boolean conditionFor = isConditionFalse();
        for (int i = 0; conditionFor; i++) {
            // This loop will never execute
            System.out.println("Unreachable loop in showBug2 method");
        }
        
        return false;
    }
    
    // Helper method to simulate a false condition
    private boolean isConditionFalse() {
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