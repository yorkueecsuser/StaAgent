class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (true && false && true && true && false && false && false && false && false && true && false) {long umatozal = -772046327;}
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