class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserting unreachable while loop
        boolean conditionWhile1 = getUnreachableCondition();
        while (conditionWhile1) {
            // This block is unreachable
            System.out.println("Unreachable code");
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserting unreachable while loop
        boolean conditionWhile2 = getUnreachableCondition();
        while (conditionWhile2) {
            // This block is unreachable
            System.out.println("Unreachable code");
        }
        
        return answer2;
    }
    
    private boolean getUnreachableCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}