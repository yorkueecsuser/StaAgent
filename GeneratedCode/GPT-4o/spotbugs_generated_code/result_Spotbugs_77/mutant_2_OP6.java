class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)

        // Unreachable for loop as mutation
        boolean loopCondition = false; // variable for loop condition
        for (int i = 0; loopCondition; i++) {
            System.out.println("This line is unreachable due to the loop condition.");
        }
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}