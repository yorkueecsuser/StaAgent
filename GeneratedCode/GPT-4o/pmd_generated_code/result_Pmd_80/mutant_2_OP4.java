class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserting unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This will never print.");
        } else {
            // This block is the default path
            System.out.println("Default path");
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserting unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This will never print either.");
        } else {
            // This block is the default path
            System.out.println("Default path for showBug2");
        }
        
        return answer2;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false; // Always returns false, making the if-block unreachable
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}