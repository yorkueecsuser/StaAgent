class SelfComparisonBug {

    public boolean showBug(int value) {
        boolean kvalazqv = false;while (kvalazqv && true && false && true && false && true && false && true && true && false && true && false) {short ijysjfda = -4416;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}