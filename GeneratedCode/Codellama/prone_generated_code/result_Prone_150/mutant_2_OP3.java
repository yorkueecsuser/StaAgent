class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean condition = getCondition();
        if (condition) {
            System.out.println(str.compareTo(str)); // BUG: SelfComparison
        } else {
            System.out.println("This branch is unreachable!");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}