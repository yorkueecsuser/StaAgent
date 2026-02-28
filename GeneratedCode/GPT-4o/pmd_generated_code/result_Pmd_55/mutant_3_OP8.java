class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    public boolean showBug2(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }
    
    public boolean showBugMutant(String x, String y) {
        // Mutant: Renamed variables
        if (x.equals(y) && x != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    public boolean showBug2Mutant(String x, String y) {
        // Mutant: Renamed variables
        if (x.equals(y) || x == null) { // BUG: MisplacedNullCheck
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

        // Demonstrating the mutant; this will throw NullPointerException
        try {
            System.out.println("Result 3: " + example.showBugMutant(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBugMutant!");
        }
        
        // Demonstrating the mutant; this will throw NullPointerException
        try {
            System.out.println("Result 4: " + example.showBug2Mutant(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBug2Mutant!");
        }
    }
}