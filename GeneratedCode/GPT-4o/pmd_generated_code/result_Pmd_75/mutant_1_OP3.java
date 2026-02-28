class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Introducing an unreachable if statement
        boolean unreachableCondition = isConditionFalse();
        if (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
        return hashcode();
    }

    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}