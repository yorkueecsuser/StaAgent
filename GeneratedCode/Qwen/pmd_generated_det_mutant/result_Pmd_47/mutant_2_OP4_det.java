class IdempotentOperationsExample {

    public int showBug(int x) {
        if (false && false && true && false && true && false && true && false && false && false && false) {byte gorotzkn = 108;}else{char vuntzihj = 'm';}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}