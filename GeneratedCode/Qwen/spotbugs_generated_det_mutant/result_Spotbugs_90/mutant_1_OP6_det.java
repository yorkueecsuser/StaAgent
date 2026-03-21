class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        for  (int zzdtetpy = 0; zzdtetpy < 0; zzdtetpy++) {String bdaslfnm = "yrhacyhe";}
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}