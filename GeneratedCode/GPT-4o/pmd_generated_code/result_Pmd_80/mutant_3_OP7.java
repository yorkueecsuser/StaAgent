class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Unreachable while loop
        boolean conditionWhile = getCondition(); // This condition is always false
        while (conditionWhile) {
            System.out.println("This is unreachable code in showBug");
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Unreachable while loop
        boolean conditionWhile = getCondition(); // This condition is always false
        while (conditionWhile) {
            System.out.println("This is unreachable code in showBug2");
        }
        
        return answer2;
    }

    private boolean getCondition() {
        return false; // Simulating an always false condition to ensure the loop is unreachable
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}