class SelfComparisonBug {

    public boolean showBug(int value) {
        if (false && false && false && false && true && true && false && true && true && false && false) {short xssizwgl = 9747;}else{boolean bphmtqsh = true;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}