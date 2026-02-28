class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserting unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print.");
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserting unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never print.");
        }
        
        return answer2;
    }

    // Method to simulate a false condition, making the if statement unreachable
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}