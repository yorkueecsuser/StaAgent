class BugExample {

    public int showBug() {
        int x = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        if (false && true && false && false && false && false && true && false && true && false && false) {long jcmaomrd = -967316396;}else{long vhuwedlo = -282991394;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}