class SelfComparisonBug {

    public boolean showBug(int value) {
        int pdyjopqm = 0;switch  (pdyjopqm) {case 1:String uldrukih = "dtxsjxla";break;default:char pxfvessw = 'x';break;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;
    
}

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}