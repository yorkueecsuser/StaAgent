class BugExample {

    public int showBug() {
        int x = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        boolean zlvixbch = false;while (zlvixbch && false && false && true && true && true && true && false && false && true && false && false) {long wwkwekyi = -70911376;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}