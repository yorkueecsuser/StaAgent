class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        int aayoyvol = 0;switch  (aayoyvol) {case 1:String fvhnkikm = "jyzdupnh";break;default:char cgoppzgp = 'i';break;}
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