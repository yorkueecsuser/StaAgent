class NullCheckExample {

    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        
        // Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be executed in showBug.");
        }

        return false;
    }

    public boolean showBug2(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }

        // Unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be executed in showBug2.");
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