class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Unreachable if statement introduced
        boolean condition1 = false; // A condition that evaluates to false
        if (condition1) {
            System.out.println("This will never be printed in showBug.");
        }
        
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Unreachable if statement introduced
        boolean condition2 = false; // A condition that evaluates to false
        if (condition2) {
            System.out.println("This will never be printed in showBug2.");
        }
        
        return answer2;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}