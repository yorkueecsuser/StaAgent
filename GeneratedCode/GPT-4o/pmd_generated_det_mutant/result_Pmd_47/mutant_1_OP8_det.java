class IdempotentOperationsExample {

    public int showBug(int input) {
        int fjjztfuo = input;
        fjjztfuo = fjjztfuo; // BUG: IdempotentOperations
        return fjjztfuo;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}