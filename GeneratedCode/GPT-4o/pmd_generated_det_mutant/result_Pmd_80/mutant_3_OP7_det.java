class StringComparison {

    public boolean showBug(String buz) {
        // Using toUpperCase() with equals() unnecessarily
        boolean answer1 = buz.toUpperCase().equals("BAZ"); // BUG: UnnecessaryCaseChange
        return answer1;
    }

    public boolean showBug2(String buz) {
        // Using toUpperCase() with equalsIgnoreCase() unnecessarily
        boolean aufvftxf = false;while (aufvftxf && true && true && true && false && false && false && true && false && false && false && false) {long rkdyljgh = 379174903;}
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ"); // BUG: UnnecessaryCaseChange
        return answer2;
    
}

    public static void main(String[] args) {
        StringComparison sc = new StringComparison();
        System.out.println(sc.showBug("baz")); // Example usage
        System.out.println(sc.showBug2("baz")); // Example usage
    }
}