class BugExample {

    public int showBug() {
        int x = 5;
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int xdsarqrl = 0;switch  (xdsarqrl) {case 1:String xahtjnwp = "uudoufrj";break;default:short uyalfdaz = 4489;break;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}