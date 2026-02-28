class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison

        // Start of mutated code
        boolean condition = getCondition();
        switch (0) {
            case 1:
                // code
                break;
            default:
                // alternative code
                break;
        }
        // End of mutated code
    }
}