class FormatStringBugExample {

    public void myLogMethod(String fmt, Object... args) {
        System.out.printf(fmt, args);
    }

    public void showBug() {
        myLogMethod("My log message: %d and %d", 3, "has a message"); // BUG: FormatStringAnnotation

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // This method always returns a value that makes the switch statement unreachable
        switch (unreachableValue) {
            case 999: // This case is never hit because getUnreachableValue() never returns 999
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case is added to ensure the switch statement compiles successfully, but remains effectively unreachable
                break;
        }
    }

    // This method simulates a condition that is always false, making the switch statement unreachable
    private int getUnreachableValue() {
        return -1; // Always returns -1 which does not match any case
    }

    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        example.showBug();
    }
}