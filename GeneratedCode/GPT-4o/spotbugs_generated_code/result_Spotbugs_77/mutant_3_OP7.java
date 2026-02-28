class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // Introducing an unreachable while loop
        boolean conditionWhile = computeCondition();
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }
        
        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)        
    }

    private boolean computeCondition() {
        return false; // This method provides a non-final variable for the while loop condition
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}