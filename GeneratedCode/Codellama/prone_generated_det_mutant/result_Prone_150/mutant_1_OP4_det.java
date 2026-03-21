class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && true && false && false && true && false && false && true && true && true && false) {short sxyulsxy = 3261;}else{char jlnanmta = 'n';}
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}