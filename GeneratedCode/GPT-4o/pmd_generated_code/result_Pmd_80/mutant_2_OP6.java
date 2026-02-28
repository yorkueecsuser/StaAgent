class StringComparison {

    public boolean showBug(String buz) {
        // Inserting unreachable for loop
        boolean executeLoop = getCondition();
        for (int i = 0; executeLoop; i++) {
            // This block is unreachable due to the always false condition
            System.out.println("This will never print.");
        }

        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Inserting unreachable for loop
        boolean executeLoop = getCondition();
        for (int i = 0; executeLoop; i++) {
            // This block is unreachable due to the always false condition
            System.out.println("This will never print.");
        }

        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    // Auxiliary method to prevent compile-time optimization
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}