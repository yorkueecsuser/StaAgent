class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Mutated method with renamed variable
    public int showBugMutant(int initialValue) {
        int x = initialValue; // Renamed variable 'i' to 'x'
        int j = initialValue;

        x = x++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
        
        // Example usage of mutated method
        System.out.println("Mutant Result: " + example.showBugMutant(0));
    }
}