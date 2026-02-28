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

            // Inserted unreachable while loop
            boolean isUnreachable = getUnreachableCondition();
            while (isUnreachable) {
                System.out.println("This code is unreachable.");
            }
        }
    }

    // Method that returns a non-final boolean value, ensuring the loop condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }
}