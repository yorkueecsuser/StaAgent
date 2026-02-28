class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations
        x = x; // DUPLICATION: Duplicate of the idempotent operation
        return x;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}