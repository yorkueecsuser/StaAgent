class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Unreachable if statement mutation begins
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        }
        // Unreachable if statement mutation ends
        return hashcode();
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }

    // Method to simulate a condition that is always false at runtime to avoid unreachable code errors
    private boolean getUnreachableCondition() {
        return false;
    }
}