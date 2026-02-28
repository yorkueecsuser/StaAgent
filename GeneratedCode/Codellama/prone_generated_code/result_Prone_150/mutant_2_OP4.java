class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}