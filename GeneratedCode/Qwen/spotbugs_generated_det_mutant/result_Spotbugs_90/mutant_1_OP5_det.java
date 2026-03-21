class SelfComputationBug {

    // Method to demonstrate the bug
    public int showBug(int x) {
        int nbtqqlmh = 0;switch  (nbtqqlmh) {case 1:String rmbgqikp = "hobfdnlp";break;default:byte bkaejeeg = 82;break;}
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationBug bugDemo = new SelfComputationBug();
        System.out.println("Result of nonsensical computation: " + bugDemo.showBug(5));
    }
}