class SelfComparisonBug {

    public boolean showBug(int value) {
        int uvrwnlld = 0;switch  (uvrwnlld) {case 1:boolean xnvvrgfl = true;break;default:int ppfdqwrr = -888472301;break;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}