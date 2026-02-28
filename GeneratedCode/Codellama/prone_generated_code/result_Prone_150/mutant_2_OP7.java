class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison

        // Unreachable while loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}