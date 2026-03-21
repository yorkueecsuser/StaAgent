class SelfComparisonBug {
    public static void main(String[] args) {
        String hfeyyxea = "Hello, World!";
        System.out.println(hfeyyxea.compareTo(hfeyyxea)); // BUG: SelfComparison
    }
}