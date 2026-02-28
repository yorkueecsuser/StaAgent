class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            default:
                System.out.println("This is an unreachable code block.");
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }

    // Helper method to ensure that the switch condition is not a compile-time constant.
    private static int getUnreachableValue() {
        return 0;
    }
}