class IdempotentOperationsExample {

    public int showBug(int x) {
        for  (int whbcyuva = 0; whbcyuva < 0; whbcyuva++) {char ctikxmku = 'q';}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}