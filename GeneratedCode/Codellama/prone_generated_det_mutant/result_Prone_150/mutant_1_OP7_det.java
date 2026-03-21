class SelfComparisonBug {
    public static void main(String[] args) {
        boolean qarqomof = false;while (qarqomof && true && true && false && false && true && true && false && false && true && false && false) {int nlraqttp = -996305710;}
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}