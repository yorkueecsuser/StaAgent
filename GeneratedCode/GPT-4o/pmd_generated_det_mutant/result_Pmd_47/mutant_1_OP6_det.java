class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        for  (int ggbhymbs = 0; ggbhymbs < 0; ggbhymbs++) {boolean nyeuvrcl = true;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}