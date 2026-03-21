class IdempotentOperationsExample {

    public int showBug(int x) {
        if (true && false && true && false && true && true && true && true && true && true && false) {long iyniogit = 663880397;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}