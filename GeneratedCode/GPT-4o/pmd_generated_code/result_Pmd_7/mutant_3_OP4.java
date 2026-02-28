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

                // Inserted unreachable if-else statement
                boolean condition = getFalseCondition();
                if (condition) {
                    System.out.println("This will never be printed.");
                } else {
                    System.out.println("This branch is always taken.");
                }

            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }
        }
    }

    // Helper method to simulate a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }
}