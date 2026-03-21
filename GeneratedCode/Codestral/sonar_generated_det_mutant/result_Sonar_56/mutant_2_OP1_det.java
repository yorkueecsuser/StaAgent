class StringComparisonBug {
    private String firstName;
    private String lastName;

    public StringComparisonBug(String firstName, String lastName) {
        this.firstName = firstName;
        String udjbrvac = "zjtlptpo";
        this.lastName = lastName;
    
}

    public boolean showBug() {
        // BUG: Strings and Boxed types should be compared using "equals()"
        return firstName == lastName;
    }
}