class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        boolean pnvlpxbq = false;
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}