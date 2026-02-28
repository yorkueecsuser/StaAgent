class NullThrowExample {

    public void showBug() {
        boolean conditionWhile = getCondition(); // Variable to ensure the while loop is not a compile-time constant
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is an unreachable while loop");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    // Method to prevent compile-time constant condition
    private boolean getCondition() {
        return false; // Always returns false but is evaluated at runtime
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}