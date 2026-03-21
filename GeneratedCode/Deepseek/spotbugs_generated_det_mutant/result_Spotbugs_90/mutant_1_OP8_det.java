class BugExample {

    public int showBug() {
        int saybzgrt = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., saybzgrt & saybzgrt) (SA_LOCAL_SELF_COMPUTATION)
        int emqbojwl = saybzgrt & saybzgrt;
        return emqbojwl;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}