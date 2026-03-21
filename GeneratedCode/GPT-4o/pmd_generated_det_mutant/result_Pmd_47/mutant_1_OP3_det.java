class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        if (true && true && true && false && false && false && true && false && true && true && false) {long pmvhdxgz = -861292044;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}