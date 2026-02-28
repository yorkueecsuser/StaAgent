class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}