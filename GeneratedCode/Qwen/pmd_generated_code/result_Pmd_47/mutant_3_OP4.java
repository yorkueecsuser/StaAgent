class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations

        // Mutant: Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            x = x + 1; // This part is reachable
        } else {
            x = x - 1; // This part is unreachable because getCondition() always returns false
        }

        return x;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}