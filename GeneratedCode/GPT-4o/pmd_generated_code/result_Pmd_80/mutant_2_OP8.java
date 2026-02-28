class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}

// Mutant code with renamed variable
class StringComparisonMutant {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean x = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return x;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    }

    public static void main(String[] args) {
        StringComparisonMutant scMutant = new StringComparisonMutant();
        System.out.println(scMutant.showBug("baz")); // Example usage
        System.out.println(scMutant.showBug2("baz")); // Example usage
    }
}