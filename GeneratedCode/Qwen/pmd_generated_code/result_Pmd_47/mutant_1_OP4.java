class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations

        // Introduced an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            x = x + 1; // This block is unreachable because getCondition() will always return false
        } else {
            x = x - 1; // This block is also unreachable for the same reason
        }

        return x;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}