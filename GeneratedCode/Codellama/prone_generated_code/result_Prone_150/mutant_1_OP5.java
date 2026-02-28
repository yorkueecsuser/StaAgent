class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
        switch (getCondition()) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is unreachable");
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}