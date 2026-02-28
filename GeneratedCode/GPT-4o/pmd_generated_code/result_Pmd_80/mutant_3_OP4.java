class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        // Unreachable if-else branch
        boolean condition = getCondition(); // Mock method to simulate a condition
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will always be printed");
        }
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        // Unreachable if-else branch
        boolean condition = getCondition(); // Mock method to simulate a condition
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This will always be printed");
        }
        return answer2;
    }

    private boolean getCondition() {
        return false; // This makes the if-else branch unreachable
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}