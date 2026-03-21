class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }
public boolean showBug2(String buz){
    boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
    answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
    return answer2;
}

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}