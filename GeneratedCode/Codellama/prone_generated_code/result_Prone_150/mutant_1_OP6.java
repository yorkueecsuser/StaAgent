class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison

        // Unreachable for loop mutation
        for (int i = 0; false; i++) {
            // Code that is never executed
            System.out.println("This code is unreachable");
        }
    }
}