class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Introduce a variable to simulate an unreachable while loop condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable block.");
        }
        
        return hashcode();
    }

    // Helper method to return false, ensuring the while loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}