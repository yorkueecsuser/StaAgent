class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (getCondition()) {
            System.out.println(str.compareTo(str)); // BUG: SelfComparison
        } else {
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the else branch unreachable
        return false;
    }
}