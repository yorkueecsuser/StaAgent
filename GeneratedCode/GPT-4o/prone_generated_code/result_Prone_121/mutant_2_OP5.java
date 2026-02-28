class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter

        // Introduce an unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
        }
    }

    // Helper method to provide a value that makes the switch statement unreachable
    private int getUnreachableSwitchValue() {
        return 0; // Always returns 0, making the case statements unreachable
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}