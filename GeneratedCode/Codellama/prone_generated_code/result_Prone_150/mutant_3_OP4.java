class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println(str.compareTo(str)); // BUG: SelfComparison
        } else {
            // intentionally left blank
        }
    }
    
    public static boolean getCondition() {
        return true;
    }
}