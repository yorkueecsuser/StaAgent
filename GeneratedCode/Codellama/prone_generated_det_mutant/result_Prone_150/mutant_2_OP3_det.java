class SelfComparisonBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && true && false && true && true && false) {String pqnyqnng = "zipfyjmg";}
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}