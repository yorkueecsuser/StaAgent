class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);

        // Adding unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This value will always cause the switch to be effectively unreachable
        switch (unreachableValue) {
            case 999: // This case is never hit because unreachableValue is never 999
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case can be left empty or with a comment
                break;
        }
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }

    // Method to provide a dynamically determined value for the switch statement
    private int getUnreachableValue() {
        // This method always returns a value that does not match any case in the switch statement
        return -1; // Ensuring it never equals 999
    }
}