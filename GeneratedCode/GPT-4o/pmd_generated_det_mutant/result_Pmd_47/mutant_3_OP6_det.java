class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        for  (int xjylhlyv = 0; xjylhlyv < 0; xjylhlyv++) {double quubsdmb = -437911371;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}