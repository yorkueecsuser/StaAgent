class BugExample {

    public int showBug() {
        int wphlclyy = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., wphlclyy & wphlclyy) (SA_LOCAL_SELF_COMPUTATION)
        int hgvtecpy = wphlclyy & wphlclyy;
        return hgvtecpy;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}