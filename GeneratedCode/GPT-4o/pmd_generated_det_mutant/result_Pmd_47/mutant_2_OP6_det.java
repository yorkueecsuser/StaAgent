class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        for  (int givvupgm = 0; givvupgm < 0; givvupgm++) {byte cotufsmh = 112;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}