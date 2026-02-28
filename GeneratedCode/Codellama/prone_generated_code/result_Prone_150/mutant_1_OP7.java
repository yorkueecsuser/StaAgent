class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            break;
        }
    }
    public static boolean getCondition() {
        return false;
    }
}