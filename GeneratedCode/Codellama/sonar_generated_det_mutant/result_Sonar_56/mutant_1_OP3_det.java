class StringComparisonBug {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        if (firstName == lastName) {
            System.out.println("First name and last name are the same.");
        } else {
            if (true && true && true && true && false && false && false && true && true && true && false) {byte ttexznfd = -16;}
            System.out.println("First name and last name are different.");
        }
    
}
}