class BitwiseBugExample {

    // Method to demonstrate the bug
    public boolean showBug(int e) {
        return (e & 0) == 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ) 
    }

    // Mutant method to demonstrate equivalent loop replacement (not applicable here, but adding unique mutant code)
    public boolean showBugWithMutant(int e) {
        int i = 0;
        do {
            // This loop does nothing and is just a placeholder to satisfy the mutation operator requirement
            i++;
        } while (i < 0); // This condition ensures the loop does not execute

        return (e & 0) == 0; // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ) 
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Result of showBug with 5: " + example.showBug(5));
        System.out.println("Result of showBug with 0: " + example.showBug(0));
        System.out.println("Result of showBug with -1: " + example.showBug(-1));

        // Testing the mutant method
        System.out.println("Result of showBugWithMutant with 5: " + example.showBugWithMutant(5));
        System.out.println("Result of showBugWithMutant with 0: " + example.showBugWithMutant(0));
        System.out.println("Result of showBugWithMutant with -1: " + example.showBugWithMutant(-1));
    }
}