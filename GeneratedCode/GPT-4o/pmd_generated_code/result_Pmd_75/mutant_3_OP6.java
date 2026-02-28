class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Mutant: Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print.");
        }
        
        return hashcode();
    }

    // Helper method for dynamic condition
    private boolean getCondition() {
        return false; // This makes the for loop unreachable
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}