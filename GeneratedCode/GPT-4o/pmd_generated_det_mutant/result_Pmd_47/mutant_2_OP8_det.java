class IdempotentOperationsExample {

    public int showBug(int input) {
        int qyejrbga = input;
        qyejrbga = qyejrbga; // BUG: IdempotentOperations
        return qyejrbga;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}