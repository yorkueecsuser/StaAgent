class SelfComparisonBug {
    public static void main(String[] args) {
        if (true && true && true && false && true && false && true && false && true && false && false) {float vttqtyrx = 739687257;}else{char hsyrkqxm = 'f';}
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}