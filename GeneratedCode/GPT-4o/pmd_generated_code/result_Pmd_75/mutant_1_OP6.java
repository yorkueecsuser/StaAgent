class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Unreachable for loop insertion
        boolean conditionForLoop = getCondition(); // This method should return false to maintain the loop unreachable
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This is an unreachable loop");
        }
        return hashcode();
    }

    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false; // Ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}