class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // Adding an unreachable if statement using a non-final variable
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This block should never execute.");
        }
        
        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    }

    // Method to simulate a non-final condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}