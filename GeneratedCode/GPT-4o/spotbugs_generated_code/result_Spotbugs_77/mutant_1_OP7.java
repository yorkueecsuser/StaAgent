class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // Ensuring the condition is not a compile-time constant
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
    }
    
    // Method to ensure the condition is not a compile-time constant
    private static boolean getCondition() {
        return false;
    }
}