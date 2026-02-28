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

        // Introducing an unreachable if-else statement
        boolean condition = getDynamicCondition(); // A method to ensure runtime evaluation
        if (condition) {
            System.out.println("This will never print");
        } else {
            System.out.println("This will always execute");
        }
    }

    // Method to simulate a runtime-determined condition
    private boolean getDynamicCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}