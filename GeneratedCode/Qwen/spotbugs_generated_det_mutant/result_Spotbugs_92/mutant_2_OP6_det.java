class SelfComparisonBug {

    public boolean showBug(int value) {
        for  (int afjumsfo = 0; afjumsfo < 0; afjumsfo++) {char rjpllhss = 'r';}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}