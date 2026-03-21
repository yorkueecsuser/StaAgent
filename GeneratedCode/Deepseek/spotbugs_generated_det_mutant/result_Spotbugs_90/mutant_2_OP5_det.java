class BugExample {

    public int showBug() {
        int x = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int mfiybtdx = 0;switch  (mfiybtdx) {case 1:char gqhbdycu = 'k';break;default:float cpnimyaj = -357572553;break;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}