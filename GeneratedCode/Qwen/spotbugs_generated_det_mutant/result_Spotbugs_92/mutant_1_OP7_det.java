class SelfComparisonBug {

    public boolean showBug(int value) {
        boolean bsfermkg = false;while (bsfermkg && false && true && false && false && false && false && true && true && true && false && false) {String tbnktcjt = "ikjeieif";}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}