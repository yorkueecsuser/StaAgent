class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int randomNumber = (int) Math.random() * 100;
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
    }
}