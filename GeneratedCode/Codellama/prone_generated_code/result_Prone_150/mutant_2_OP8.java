class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    }

    // Added mutant
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo("world")); // Mutant: SelfComparison with literal value
    }
}