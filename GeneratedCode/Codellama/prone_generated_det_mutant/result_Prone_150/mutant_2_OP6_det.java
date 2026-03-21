class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        for  (int lafhtkyb = 0; lafhtkyb < 0; lafhtkyb++) {boolean pmsvpzbg = true;}
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}