class BugExample {

    public int showBug() {
        int x = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        for  (int dpxtsogr = 0; dpxtsogr < 0; dpxtsogr++) {String hzvrqymh = "xqdtzmgn";}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}