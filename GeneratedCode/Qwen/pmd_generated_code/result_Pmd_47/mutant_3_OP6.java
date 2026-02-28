class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations

        // Introduced unreachable for loop according to mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            x += i;
        }

        return x;
    }

    private boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}