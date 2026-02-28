class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Insert unreachable switch statement here
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This case will never be reached
                System.out.println("Unreachable code");
                break;
            default:
                // Default case to ensure switch is valid
                break;
        }

        return hashcode();
    }

    // Method to provide a non-final value for the switch statement
    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch case 1 unreachable
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}