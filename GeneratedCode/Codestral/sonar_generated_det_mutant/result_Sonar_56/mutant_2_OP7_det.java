class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        boolean hedpenhh = false;while (hedpenhh && false && true && false && true && true && false && false && false && false && true && false) {long dssudqbp = 759376230;}
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}