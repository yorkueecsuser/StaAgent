class SelfComparisonBug {
    public static void main(String[] args) {
        String xnfdkyhz = "Hello, World!";
        System.out.println(xnfdkyhz.compareTo(xnfdkyhz)); // BUG: SelfComparison
    }
}