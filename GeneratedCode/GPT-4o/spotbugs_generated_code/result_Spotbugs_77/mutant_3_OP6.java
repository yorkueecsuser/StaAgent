class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // Inserting an unreachable for loop based on mutant description
        boolean conditionFor = false; // non-final variable to avoid compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code");
        }

        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE) 
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}