class SelfComparisonBug {
    public static void main(String[] args) {
        String rwusaiwr = "Hello, World!";
        System.out.println(rwusaiwr.compareTo(rwusaiwr)); // BUG: SelfComparison
    }
}