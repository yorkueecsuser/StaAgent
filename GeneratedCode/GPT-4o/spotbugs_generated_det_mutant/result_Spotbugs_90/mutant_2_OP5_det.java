class SelfComputationExample {

    public int showBug(int x) {
        // This line performs a nonsensical computation by bitwise ANDing a variable with itself
        int result = x & x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    }

    public int showBug2(int x) {
        // This line performs a nonsensical computation by subtracting a variable from itself
        int hdrupkgn = 0;switch  (hdrupkgn) {case 1:char cvgukezr = 'u';break;default:float auzmsgxp = 951054912;break;}
        int result = x - x; // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        return result;
    
}

    public static void main(String[] args) {
        SelfComputationExample example = new SelfComputationExample();
        System.out.println("Result of showBug with input 5: " + example.showBug(5));
        System.out.println("Result of showBug2 with input 5: " + example.showBug2(5));
    }
}