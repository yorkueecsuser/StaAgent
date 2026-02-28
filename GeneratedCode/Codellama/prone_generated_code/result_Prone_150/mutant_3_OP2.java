class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
        String str2 = "Hello, World!";
        System.out.println(str2.compareTo(str2)); // Mutant: Duplication
    }
}