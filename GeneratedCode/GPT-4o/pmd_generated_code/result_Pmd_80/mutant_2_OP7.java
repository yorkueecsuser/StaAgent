class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange

        // Introduce unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Unreachable code");
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange

        // Introduce unreachable while loop
        boolean conditionWhile2 = getUnreachableCondition();
        while (conditionWhile2) {
            // This block is unreachable
            System.out.println("Unreachable code");
        }

        return answer2;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }

    // Method to provide a false condition for unreachable while loop
    private boolean getUnreachableCondition() {
        return false;
    }
}