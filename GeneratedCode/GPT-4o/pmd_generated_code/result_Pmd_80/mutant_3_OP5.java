class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserted unreachable switch statement
        String condition = getCondition();
        switch (condition) { 
            case "unreachable": 
                System.out.println("This will never be printed");
                break;
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        
        // Inserted unreachable switch statement
        String condition = getCondition();
        switch (condition) { 
            case "unreachable": 
                System.out.println("This will never be printed");
                break;
        }

        return answer2;
    }
    
    // Method to simulate a non-final variable for unreachable switch statement
    private String getCondition() {
        return "alwaysFalse"; // Ensures the switch case never matches
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}