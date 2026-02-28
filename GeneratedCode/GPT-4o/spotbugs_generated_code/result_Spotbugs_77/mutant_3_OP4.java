class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        boolean bugResult = str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)

        // Introduce an unreachable if-else statement
        boolean condition = false; // This condition will never be true
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }

        return bugResult;
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}