class IdempotentOperationsMutation {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;
        // Added Mutant: Unreachable If Statement
        if (false) {
            // This code will be unreachable
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsMutation bug = new IdempotentOperationsMutation();
        bug.showBug();
    }
}