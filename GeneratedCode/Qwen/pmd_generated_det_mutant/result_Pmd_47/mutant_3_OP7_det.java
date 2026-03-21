class IdempotentOperationsExample {

    public int showBug(int x) {
        boolean qjibygpg = false;while (qjibygpg && true && true && true && false && true && false && true && true && true && false && false) {char hkvdwgnd = 'p';}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}