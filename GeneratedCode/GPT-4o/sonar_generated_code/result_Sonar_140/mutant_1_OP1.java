class IncrementBugExample {
    
    public int showBug(int initialValue) {
        int i = initialValue;
        int j = initialValue;
        
        // Dead store mutation
        int abcdefgh = 0; // This is the dead store variable

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        
        // Example usage
        System.out.println("Result: " + example.showBug(0));
    }
}