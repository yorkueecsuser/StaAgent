class NullPointerExceptionExample {

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug();
    }

    public void showBug() {
        String[] data = {"first", null, "third"};
        for (String value : data) {
            try {
                // Perform some operation that might throw NullPointerException
                System.out.println(value.toUpperCase());
            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }
        }

        // Inserted unreachable if branch
        boolean condition = getFalseCondition(); // Non-final variable used to ensure no compile-time constants
        if (condition) {
            System.out.println("This code is unreachable and should never be executed.");
        }
    }

    // Method to simulate a false condition
    private boolean getFalseCondition() {
        return false;
    }
}