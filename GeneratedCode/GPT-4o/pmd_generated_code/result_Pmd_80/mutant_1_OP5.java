class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange

        // Unreachable switch statement inserted
        int unreachableSwitchCondition = getDynamicValue();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                break;
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange

        // Unreachable switch statement inserted
        int unreachableSwitchCondition = getDynamicValue();
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                break;
        }

        return answer2;
    }

    private int getDynamicValue() {
        return 0; // Always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}