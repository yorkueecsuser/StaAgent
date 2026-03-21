class IdempotentOperationsExample {

    public int showBug(int x) {
        if (true && true && false && false && true && true && true && false && true && false && false) {byte zxyalfdq = -120;}else{int nwtwbwkg = -70925989;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}