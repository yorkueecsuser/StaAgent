class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // This will always be false
        for (int i = 0; conditionFor; i++) {
            System.out.println("This for loop is unreachable.");
        }

        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange

        // Inserting another unreachable for loop
        boolean conditionFor2 = getCondition(); // This will always be false
        for (int i = 0; conditionFor2; i++) {
            System.out.println("This for loop is also unreachable.");
        }

        return answer2;
    }

    public static boolean getCondition() {
        return false; // This method always returns false, making loops unreachable
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}