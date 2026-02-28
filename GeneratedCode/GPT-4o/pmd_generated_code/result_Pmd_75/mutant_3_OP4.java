class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Inserted unreachable if-else branch
        boolean alwaysFalse = getFalseCondition();
        if (alwaysFalse) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
        return hashcode();
    }

    // Helper method to provide a non-final variable or equivalent for condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}