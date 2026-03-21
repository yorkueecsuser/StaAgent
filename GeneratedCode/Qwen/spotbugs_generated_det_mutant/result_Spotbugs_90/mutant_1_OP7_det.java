class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        boolean oggxhvcb = false;while (oggxhvcb && false && true && false && true && true && true && true && false && true && false && false) {char blcvotmk = 'v';}
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}