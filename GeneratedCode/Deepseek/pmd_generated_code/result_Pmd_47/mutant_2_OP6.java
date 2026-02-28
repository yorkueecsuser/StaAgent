class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;

        // Mutant Code: Adding unreachable for loop
        boolean shouldRun = x > 2;
        for (int i = 0; shouldRun; i++) {
            // Do nothing, this loop is unreachable
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}