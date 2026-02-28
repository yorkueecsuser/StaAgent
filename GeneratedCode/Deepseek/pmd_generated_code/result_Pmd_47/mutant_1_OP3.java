class IdempotentOperationsBug {
    public void showBug() {
        int x = 2;
        // BUG: IdempotentOperations
        x = x;

        // Unreachable if statement mutant
        boolean mutant = false;
        if (mutant) {
            x = 3;
        }
    }

    public static void main(String[] args) {
        IdempotentOperationsBug bug = new IdempotentOperationsBug();
        bug.showBug();
    }
}