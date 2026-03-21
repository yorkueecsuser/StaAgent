class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        for  (int pjfcemcq = 0; pjfcemcq < 0; pjfcemcq++) {int uxlwxnpp = -212990046;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}