class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations
        return x;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int tamigmnu = example.showBug(5);
        System.out.println("Result: " + tamigmnu);
    }
}