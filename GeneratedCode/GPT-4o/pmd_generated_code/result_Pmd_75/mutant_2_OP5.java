class HashcodeExample {

    // This method's name is suspiciously close to 'hashCode', but does not override it
    public int hashcode() { // BUG: SuspiciousHashcodeMethodName
        return 42;
    }

    // Method to demonstrate the bug
    public int showBug() {
        // Unreachable switch statement
        int number = getNumberForSwitch();
        switch (number) {
            case 1:
                System.out.println("This is unreachable case 1.");
                break;
            case 2:
                System.out.println("This is unreachable case 2.");
                break;
            default:
                System.out.println("Default case, but still unreachable.");
                break;
        }
        return hashcode();
    }

    // Helper method to provide a number for the switch statement
    private int getNumberForSwitch() {
        // This will always return a value that is not 1 or 2, making switch cases unreachable
        return 0;
    }

    public static void main(String[] args) {
        HashcodeExample example = new HashcodeExample();
        System.out.println("Result of hashcode method: " + example.showBug());
    }
}