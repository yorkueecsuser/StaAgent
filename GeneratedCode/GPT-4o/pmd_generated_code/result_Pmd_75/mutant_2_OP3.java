class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Inserted unreachable if statement
        boolean condition = getFalseCondition(); // This condition will always be false
        if (condition) {
            System.out.println("This code is unreachable");
        }

        return hashcode();
    }

    // Method to return a false condition to simulate unreachable code
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}