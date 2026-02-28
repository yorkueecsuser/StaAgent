class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        boolean conditionWhile = getCondition(); // Introduce a condition for the while loop
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This will never print");
        }
        return 42;
    }

    // Method to simulate dynamic condition (always returns false for the unreachable loop)
    private boolean getCondition() {
        return false;
    }

    // Method to demonstrate the bug
    public int showBug() {
        return hashcode();
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}