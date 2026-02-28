class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Adding an unreachable switch statement mutation
        int someValue = getDynamicValue();
        switch (someValue) {
            case 99999: // This case will never be true as getDynamicValue() should never return 99999
                System.out.println("Unreachable code executed!");
                break;
            default:
                break;
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Adding a different unreachable switch statement mutation
        int anotherValue = getAnotherDynamicValue();
        switch (anotherValue) {
            case 88888: // This case will never be true as getAnotherDynamicValue() should never return 88888
                System.out.println("Another unreachable code executed!");
                break;
            default:
                break;
        }
        
        return answer2;
    }
    
    // Method to simulate dynamic value retrieval
    public int getDynamicValue() {
        return 0; // Always returning 0 to ensure the switch case 99999 is unreachable
    }
    
    // Another method to simulate dynamic value retrieval
    public int getAnotherDynamicValue() {
        return 0; // Always returning 0 to ensure the switch case 88888 is unreachable
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}