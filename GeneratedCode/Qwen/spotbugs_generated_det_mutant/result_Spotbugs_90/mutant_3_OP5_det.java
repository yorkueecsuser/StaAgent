class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int bobwzjns = 0;switch  (bobwzjns) {case 1:char advubama = 't';break;default:int qhgykuxn = 650810202;break;}
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}