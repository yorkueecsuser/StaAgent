class IdempotentOperationsExample {

    public int showBug(int x) {
        if (false && true && false && true && true && true && true && true && true && true && false) {boolean fhdvoefl = true;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}