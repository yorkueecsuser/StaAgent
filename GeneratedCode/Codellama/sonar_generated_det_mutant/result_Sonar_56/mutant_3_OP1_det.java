class StringComparisonBug {
    public static void main(String[] args) {
        boolean ncbyhyes = true;
        String firstName = "John";
        String lastName = "Doe";

        if (firstName == lastName) {
            System.out.println("First name and last name are the same.");
        } else {
            System.out.println("First name and last name are different.");
        }
    
}
}