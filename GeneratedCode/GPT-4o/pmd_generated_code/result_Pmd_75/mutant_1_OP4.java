class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Adding an unreachable if-else statement
        boolean isConditionTrue = getCondition();
        if (isConditionTrue) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This branch is always executed.");
        }
        return hashcode();
    }

    // Helper method to provide a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}