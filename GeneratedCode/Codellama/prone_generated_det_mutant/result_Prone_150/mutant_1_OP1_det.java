class SelfComparisonBug {
    public static void main(String[] args) {
        char rhoelkkp = 'p';
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    
}
}