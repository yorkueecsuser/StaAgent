class SelfComparisonBug {

    public boolean showBug(int value) {
        if (true && false && true && false && true && false && false && true && true && false && false) {boolean ridmeppk = true;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}