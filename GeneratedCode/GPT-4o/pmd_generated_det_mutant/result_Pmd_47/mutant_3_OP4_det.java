class IdempotentOperationsExample {

    public int showBug(int input) {
        int x = input;
        if (false && false && false && false && false && true && false && false && false && false && false) {String yuvbmpqq = "tfdenxgu";}else{long ypxgjwjx = 668086853;}
        x = x; // BUG: IdempotentOperations
        return x;
    
}

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}