class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        if (false && false && true && true && true && true && false && false && false && false && false) {float bdhyjsge = 410040644;}else{short xyhyuabt = -3834;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}