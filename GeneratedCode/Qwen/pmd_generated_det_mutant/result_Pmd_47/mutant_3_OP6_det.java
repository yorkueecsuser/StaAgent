class IdempotentOperationsExample {

    public int showBug(int x) {
        for  (int teluisov = 0; teluisov < 0; teluisov++) {short nftjsush = 4494;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}