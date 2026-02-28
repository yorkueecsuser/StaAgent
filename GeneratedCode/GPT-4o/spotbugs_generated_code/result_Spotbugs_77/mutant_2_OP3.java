class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        boolean bugResult = str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)

        // Introduce an unreachable if statement
        boolean unreachableCondition = calculateCondition();
        if (unreachableCondition) {
            // This block is unreachable due to the condition being false
            System.out.println("This will never be printed.");
        }

        return bugResult;
    }

    private boolean calculateCondition() {
        // Logic to ensure the condition evaluates to false
        return false;
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}