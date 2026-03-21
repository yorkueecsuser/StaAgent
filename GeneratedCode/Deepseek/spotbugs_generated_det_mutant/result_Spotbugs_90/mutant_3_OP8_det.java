class BugExample {

    public int showBug() {
        int lrqtxuot = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., lrqtxuot & lrqtxuot) (SA_LOCAL_SELF_COMPUTATION)
        int czxszmnr = lrqtxuot & lrqtxuot;
        return czxszmnr;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}