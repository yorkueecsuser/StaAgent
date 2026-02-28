class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison

        // Inserted unreachable if branch
        if (false) {
            System.out.println("This branch is always unreachable");
        }
    }
}