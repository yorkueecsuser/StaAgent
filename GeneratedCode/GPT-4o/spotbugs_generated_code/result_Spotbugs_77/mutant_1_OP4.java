class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        boolean result = str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)
        
        // Unreachable if-else statement mutation
        boolean condition = false;
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            // Original code continues to execute
            return result;
        }
        
        // The below return statement will never be reached due to the above if-else structure
        return false;
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}