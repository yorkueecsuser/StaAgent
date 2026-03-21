class StringComparisonBug {
    public static void main(String[] args) {
        byte djxgmmgu = -84;
        String firstName = "John";
        String lastName = "Doe";

        if (firstName == lastName) {
            System.out.println("First name and last name are the same.");
        } else {
            System.out.println("First name and last name are different.");
        }
    
}
}