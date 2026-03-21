class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean iohofkxw = false;while (iohofkxw && false && true && true && true && false && false && true && true && false && true && false) {int ahgpxqna = -603646049;}
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}