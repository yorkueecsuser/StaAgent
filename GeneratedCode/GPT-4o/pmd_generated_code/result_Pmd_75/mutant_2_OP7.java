class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        return hashcode();
    }

    // Method to provide a runtime condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();

        // Unreachable while loop based on a runtime condition
        boolean conditionWhile = example.getCondition();
        while (conditionWhile) {
            System.out.println("This code will never be executed.");
        }

        System.out.println("Result of hashcode method: " + example.showBug());
    }
}