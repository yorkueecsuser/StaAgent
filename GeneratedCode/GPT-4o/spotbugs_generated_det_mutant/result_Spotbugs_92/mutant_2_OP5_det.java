class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        int gckzljqp = 0;switch  (gckzljqp) {case 1:float vdhaarcy = 753231958;break;default:boolean qiezeapw = false;break;}
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}