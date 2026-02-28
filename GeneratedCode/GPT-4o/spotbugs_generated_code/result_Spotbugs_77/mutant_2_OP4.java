class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;

        // Mutant code: introducing an unreachable if-else statement
        boolean isUnreachable = false; // non-final variable
        if (isUnreachable) {
            // This code will never execute
            System.out.println("This is unreachable code");
        } else {
            // Original code with the bug
            return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        }
        
        // Adding unreachable return statement to satisfy method return type
        // This will never be reached due to the return statement in the else block
        return false;
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}