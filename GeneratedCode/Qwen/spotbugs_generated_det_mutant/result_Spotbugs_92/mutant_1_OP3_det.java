class SelfComparisonBug {

    public boolean showBug(int value) {
        if (false && false && true && true && true && true && true && true && true && false && false) {String jwyjchyb = "qjqnnrqa";}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}