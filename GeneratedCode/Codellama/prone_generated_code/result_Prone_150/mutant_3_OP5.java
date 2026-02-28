class SelfComparisonBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.compareTo(str)); // BUG: SelfComparison
        int value = getValue();
        switch (value) {
            case 1: // Unreachable switch statement
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
    }

    public static int getValue() {
        return 0;
    }
}