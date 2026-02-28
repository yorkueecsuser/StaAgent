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
    
    // Mutant method with renamed variable
    public boolean mutantShowBug(String x) {
        // Using toUpperCase() with equals() unnecessarily
        boolean a = x.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return a;
    }

    public boolean mutantShowBug2(String y) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean b = y.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return b;
    }

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage

        // Mutant method usages
        System.out.println(sc.mutantShowBug("baz")); // Example usage
        System.out.println(sc.mutantShowBug2("baz")); // Example usage
    }
}