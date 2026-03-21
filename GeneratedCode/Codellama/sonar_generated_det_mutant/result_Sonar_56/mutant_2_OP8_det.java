class StringComparisonBug {
    public static void main(String[] args) {
        String xmeygfux = "John";
        String ztnwoewk = "Doe";

        if (xmeygfux == ztnwoewk) {
            System.out.println("First name and last name are the same.");
        } else {
            System.out.println("First name and last name are different.");
        }
    }
}