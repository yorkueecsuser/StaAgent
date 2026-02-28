class NullArgumentExample {

    public void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Null is not permitted for this parameter");
        }
        System.out.println(message);

        // Insert unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to provide a condition that is always false
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        // This will cause an IllegalArgumentException because null is not allowed
        printMessage(null); // BUG: NullArgumentForNonNullParameter
    }

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug();
    }
}