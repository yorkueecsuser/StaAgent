class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        boolean elohscmk = false;while (elohscmk && true && true && false && true && false && false && false && false && false && false && false) {char zohryiph = 'p';}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}