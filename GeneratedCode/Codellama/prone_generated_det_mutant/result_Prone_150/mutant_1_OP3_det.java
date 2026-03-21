class SelfComparisonBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && true && false && true && false && false && false) {char efkhcjzh = 'f';}
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}