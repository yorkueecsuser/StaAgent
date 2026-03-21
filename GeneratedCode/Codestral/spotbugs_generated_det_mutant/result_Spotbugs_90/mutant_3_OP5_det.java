class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int qfioqdgc = 0;switch  (qfioqdgc) {case 1:byte fnljgagy = -110;break;default:double tuiwlqma = 940140680;break;}
        int result = x & x;
        return result;
    
}

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}