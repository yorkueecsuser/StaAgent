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
    
    // Mutated method with a variable renaming
    public boolean showBugMutant(String x, String y) {
        // This line contains a misplaced null check.
        if (x.equals(y) && x != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }

    // Another mutated method with a different variable renaming
    public boolean showBug2Mutant(String z, String b) {
        // This line contains a misplaced null check.
        if (z.equals(b) || z == null) { // BUG: MisplacedNullCheck
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

        // Demonstrating the bug with mutant method; this will throw NullPointerException
        try {
            System.out.println("Mutant Result 1: " + example.showBugMutant(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBugMutant!");
        }
        
        // Demonstrating the bug with mutant method; this will throw NullPointerException
        try {
            System.out.println("Mutant Result 2: " + example.showBug2Mutant(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBug2Mutant!");
        }
    }
}