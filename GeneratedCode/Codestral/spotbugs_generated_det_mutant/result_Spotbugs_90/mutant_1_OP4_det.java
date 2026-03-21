class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        if (false && true && false && true && true && false && true && false && false && true && false) {double bqcwenwi = -575242563;}else{boolean dntsqpsd = false;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}