class StringComparison {

    public boolean showBug(String buz) {
        // Unreachable if statement with non-final variable
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Unreachable if statement with non-final variable
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    // Method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}