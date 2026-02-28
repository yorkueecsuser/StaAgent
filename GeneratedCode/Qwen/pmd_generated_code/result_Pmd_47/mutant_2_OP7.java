class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations

        // Introduced Unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            x += 1; // Some operation to ensure the loop body is not empty
        }

        return x;
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}