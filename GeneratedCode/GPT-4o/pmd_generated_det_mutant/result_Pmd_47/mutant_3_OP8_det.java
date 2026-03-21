class IdempotentOperationsExample {

    public int showBug(int input) {
        int hwtlbkrd = input;
        hwtlbkrd = hwtlbkrd; // BUG: IdempotentOperations
        return hwtlbkrd;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}