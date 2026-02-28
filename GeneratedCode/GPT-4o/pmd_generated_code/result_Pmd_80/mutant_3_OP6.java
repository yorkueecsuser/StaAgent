class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserted unreachable for loop
        boolean conditionForLoop = getFalseCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This is an unreachable loop");
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserted unreachable for loop
        boolean conditionForLoop = getFalseCondition();
        for (int i = 0; conditionForLoop; i++) {
            System.out.println("This is an unreachable loop");
        }
        
        return answer2;
    }
    
    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}