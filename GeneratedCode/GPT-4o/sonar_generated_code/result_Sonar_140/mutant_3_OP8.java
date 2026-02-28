class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    // Renamed variable 'i' to 'a' for mutation
    public int showBugMutant1(int initialValue) {
        int a = initialValue;
        int j = initialValue;

        a = a++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));

        // Example usage for mutant method
        System.out.println("Result from mutant: " + example.showBugMutant1(0));
    }
}