class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (false && false && false && true && false && false && true && false && true && true && false) {byte usktwysl = 30;}
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}