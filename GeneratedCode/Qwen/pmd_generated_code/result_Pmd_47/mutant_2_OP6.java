class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor will always be false
        }

        return x;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}