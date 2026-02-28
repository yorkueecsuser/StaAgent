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

        // Inserted unreachable for loop
        boolean conditionForUnreachable = getUnreachableCondition();
        for (int i = 0; conditionForUnreachable; i++) {
            System.out.println("This statement is unreachable.");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This makes the for loop condition always false at runtime
    }
}