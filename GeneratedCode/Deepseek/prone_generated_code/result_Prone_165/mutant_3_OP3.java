class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code block won't run due to the mutation
            System.out.println("This will never be printed due to the mutation");
        } else {
            System.out.println("This will always be printed");
        }
    }

    // This method is used in the mutated if-else condition to ensure it is not a compile-time constant
    private static boolean getCondition() {
        return false;
    }
}