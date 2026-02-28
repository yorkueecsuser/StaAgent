class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Introduce an unreachable if-else statement
        boolean condition = getCondition(); // This method will always return false
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the else branch.");
        }
        return hashcode();
    }

    // Method to return false, making the if condition always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}