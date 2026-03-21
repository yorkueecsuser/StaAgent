class IdempotentOperationsExample {

    public int showBug(int x) {
        for  (int ufhkdhnl = 0; ufhkdhnl < 0; ufhkdhnl++) {short sqoatdsn = -4204;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}